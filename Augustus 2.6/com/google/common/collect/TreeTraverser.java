// 
// Decompiled by Procyon v0.5.36
// 

package com.google.common.collect;

import java.util.Collection;
import java.util.Queue;
import javax.annotation.CheckForNull;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.function.Consumer;
import com.google.common.base.Preconditions;
import com.google.common.base.Function;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.Beta;

@Deprecated
@ElementTypesAreNonnullByDefault
@Beta
@GwtCompatible
public abstract class TreeTraverser<T>
{
    @Deprecated
    public static <T> TreeTraverser<T> using(final Function<T, ? extends Iterable<T>> nodeToChildrenFunction) {
        Preconditions.checkNotNull(nodeToChildrenFunction);
        return new TreeTraverser<T>() {
            @Override
            public Iterable<T> children(final T root) {
                return nodeToChildrenFunction.apply(root);
            }
        };
    }
    
    public abstract Iterable<T> children(final T p0);
    
    @Deprecated
    public final FluentIterable<T> preOrderTraversal(final T root) {
        Preconditions.checkNotNull(root);
        return new FluentIterable<T>() {
            @Override
            public UnmodifiableIterator<T> iterator() {
                return (UnmodifiableIterator<T>)TreeTraverser.this.preOrderIterator(root);
            }
            
            @Override
            public void forEach(final Consumer<? super T> action) {
                Preconditions.checkNotNull(action);
                new Consumer<T>() {
                    @Override
                    public void accept(final T t) {
                        action.accept(t);
                        TreeTraverser.this.children(t).forEach(this);
                    }
                }.accept(root);
            }
        };
    }
    
    UnmodifiableIterator<T> preOrderIterator(final T root) {
        return new PreOrderIterator(root);
    }
    
    @Deprecated
    public final FluentIterable<T> postOrderTraversal(final T root) {
        Preconditions.checkNotNull(root);
        return new FluentIterable<T>() {
            @Override
            public UnmodifiableIterator<T> iterator() {
                return (UnmodifiableIterator<T>)TreeTraverser.this.postOrderIterator(root);
            }
            
            @Override
            public void forEach(final Consumer<? super T> action) {
                Preconditions.checkNotNull(action);
                new Consumer<T>() {
                    @Override
                    public void accept(final T t) {
                        TreeTraverser.this.children(t).forEach(this);
                        action.accept(t);
                    }
                }.accept(root);
            }
        };
    }
    
    UnmodifiableIterator<T> postOrderIterator(final T root) {
        return new PostOrderIterator(root);
    }
    
    @Deprecated
    public final FluentIterable<T> breadthFirstTraversal(final T root) {
        Preconditions.checkNotNull(root);
        return new FluentIterable<T>() {
            @Override
            public UnmodifiableIterator<T> iterator() {
                return new BreadthFirstIterator(root);
            }
        };
    }
    
    private final class PreOrderIterator extends UnmodifiableIterator<T>
    {
        private final Deque<Iterator<T>> stack;
        
        PreOrderIterator(final T root) {
            (this.stack = new ArrayDeque<Iterator<T>>()).addLast((Iterator<T>)Iterators.singletonIterator((Object)Preconditions.checkNotNull((T)root)));
        }
        
        @Override
        public boolean hasNext() {
            return !this.stack.isEmpty();
        }
        
        @Override
        public T next() {
            final Iterator<T> itr = this.stack.getLast();
            final T result = Preconditions.checkNotNull(itr.next());
            if (!itr.hasNext()) {
                this.stack.removeLast();
            }
            final Iterator<T> childItr = TreeTraverser.this.children(result).iterator();
            if (childItr.hasNext()) {
                this.stack.addLast(childItr);
            }
            return result;
        }
    }
    
    private static final class PostOrderNode<T>
    {
        final T root;
        final Iterator<T> childIterator;
        
        PostOrderNode(final T root, final Iterator<T> childIterator) {
            this.root = Preconditions.checkNotNull(root);
            this.childIterator = Preconditions.checkNotNull(childIterator);
        }
    }
    
    private final class PostOrderIterator extends AbstractIterator<T>
    {
        private final ArrayDeque<PostOrderNode<T>> stack;
        
        PostOrderIterator(final T root) {
            (this.stack = new ArrayDeque<PostOrderNode<T>>()).addLast(this.expand(root));
        }
        
        @CheckForNull
        @Override
        protected T computeNext() {
            while (!this.stack.isEmpty()) {
                final PostOrderNode<T> top = this.stack.getLast();
                if (!top.childIterator.hasNext()) {
                    this.stack.removeLast();
                    return top.root;
                }
                final T child = top.childIterator.next();
                this.stack.addLast(this.expand(child));
            }
            return this.endOfData();
        }
        
        private PostOrderNode<T> expand(final T t) {
            return new PostOrderNode<T>(t, TreeTraverser.this.children(t).iterator());
        }
    }
    
    private final class BreadthFirstIterator extends UnmodifiableIterator<T> implements PeekingIterator<T>
    {
        private final Queue<T> queue;
        
        BreadthFirstIterator(final T root) {
            (this.queue = new ArrayDeque<T>()).add(root);
        }
        
        @Override
        public boolean hasNext() {
            return !this.queue.isEmpty();
        }
        
        @Override
        public T peek() {
            return this.queue.element();
        }
        
        @Override
        public T next() {
            final T result = this.queue.remove();
            Iterables.addAll(this.queue, (Iterable<? extends T>)TreeTraverser.this.children(result));
            return result;
        }
    }
}
