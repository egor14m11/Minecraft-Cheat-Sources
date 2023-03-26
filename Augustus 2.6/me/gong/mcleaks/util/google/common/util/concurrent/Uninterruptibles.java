// 
// Decompiled by Procyon v0.5.36
// 

package me.gong.mcleaks.util.google.common.util.concurrent;

import java.util.concurrent.Semaphore;
import java.util.concurrent.BlockingQueue;
import me.gong.mcleaks.util.google.common.base.Preconditions;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import me.gong.mcleaks.util.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.TimeUnit;
import me.gong.mcleaks.util.google.common.annotations.GwtIncompatible;
import java.util.concurrent.CountDownLatch;
import me.gong.mcleaks.util.google.common.annotations.GwtCompatible;
import me.gong.mcleaks.util.google.common.annotations.Beta;

@Beta
@GwtCompatible(emulated = true)
public final class Uninterruptibles
{
    @GwtIncompatible
    public static void awaitUninterruptibly(final CountDownLatch latch) {
        boolean interrupted = false;
        while (true) {
            try {
                latch.await();
            }
            catch (InterruptedException e) {
                interrupted = true;
                continue;
            }
            finally {
                if (interrupted) {
                    Thread.currentThread().interrupt();
                }
            }
            break;
        }
    }
    
    @CanIgnoreReturnValue
    @GwtIncompatible
    public static boolean awaitUninterruptibly(final CountDownLatch latch, final long timeout, final TimeUnit unit) {
        boolean interrupted = false;
        try {
            long remainingNanos = unit.toNanos(timeout);
            final long end = System.nanoTime() + remainingNanos;
            try {
                return latch.await(remainingNanos, TimeUnit.NANOSECONDS);
            }
            catch (InterruptedException e) {
                interrupted = true;
                remainingNanos = end - System.nanoTime();
            }
        }
        finally {
            if (interrupted) {
                Thread.currentThread().interrupt();
            }
        }
    }
    
    @GwtIncompatible
    public static void joinUninterruptibly(final Thread toJoin) {
        boolean interrupted = false;
        while (true) {
            try {
                toJoin.join();
            }
            catch (InterruptedException e) {
                interrupted = true;
                continue;
            }
            finally {
                if (interrupted) {
                    Thread.currentThread().interrupt();
                }
            }
            break;
        }
    }
    
    @CanIgnoreReturnValue
    public static <V> V getUninterruptibly(final Future<V> future) throws ExecutionException {
        boolean interrupted = false;
        try {
            return future.get();
        }
        catch (InterruptedException e) {
            interrupted = true;
            return future.get();
        }
        finally {
            if (interrupted) {
                Thread.currentThread().interrupt();
            }
        }
    }
    
    @CanIgnoreReturnValue
    @GwtIncompatible
    public static <V> V getUninterruptibly(final Future<V> future, final long timeout, final TimeUnit unit) throws ExecutionException, TimeoutException {
        boolean interrupted = false;
        try {
            long remainingNanos = unit.toNanos(timeout);
            final long end = System.nanoTime() + remainingNanos;
            try {
                return future.get(remainingNanos, TimeUnit.NANOSECONDS);
            }
            catch (InterruptedException e) {
                interrupted = true;
                remainingNanos = end - System.nanoTime();
            }
        }
        finally {
            if (interrupted) {
                Thread.currentThread().interrupt();
            }
        }
    }
    
    @GwtIncompatible
    public static void joinUninterruptibly(final Thread toJoin, final long timeout, final TimeUnit unit) {
        Preconditions.checkNotNull(toJoin);
        boolean interrupted = false;
        try {
            long remainingNanos = unit.toNanos(timeout);
            final long end = System.nanoTime() + remainingNanos;
            try {
                TimeUnit.NANOSECONDS.timedJoin(toJoin, remainingNanos);
            }
            catch (InterruptedException e) {
                interrupted = true;
                remainingNanos = end - System.nanoTime();
            }
        }
        finally {
            if (interrupted) {
                Thread.currentThread().interrupt();
            }
        }
    }
    
    @GwtIncompatible
    public static <E> E takeUninterruptibly(final BlockingQueue<E> queue) {
        boolean interrupted = false;
        try {
            return queue.take();
        }
        catch (InterruptedException e) {
            interrupted = true;
            return queue.take();
        }
        finally {
            if (interrupted) {
                Thread.currentThread().interrupt();
            }
        }
    }
    
    @GwtIncompatible
    public static <E> void putUninterruptibly(final BlockingQueue<E> queue, final E element) {
        boolean interrupted = false;
        while (true) {
            try {
                queue.put(element);
            }
            catch (InterruptedException e) {
                interrupted = true;
                continue;
            }
            finally {
                if (interrupted) {
                    Thread.currentThread().interrupt();
                }
            }
            break;
        }
    }
    
    @GwtIncompatible
    public static void sleepUninterruptibly(final long sleepFor, final TimeUnit unit) {
        boolean interrupted = false;
        try {
            long remainingNanos = unit.toNanos(sleepFor);
            final long end = System.nanoTime() + remainingNanos;
            try {
                TimeUnit.NANOSECONDS.sleep(remainingNanos);
            }
            catch (InterruptedException e) {
                interrupted = true;
                remainingNanos = end - System.nanoTime();
            }
        }
        finally {
            if (interrupted) {
                Thread.currentThread().interrupt();
            }
        }
    }
    
    @GwtIncompatible
    public static boolean tryAcquireUninterruptibly(final Semaphore semaphore, final long timeout, final TimeUnit unit) {
        return tryAcquireUninterruptibly(semaphore, 1, timeout, unit);
    }
    
    @GwtIncompatible
    public static boolean tryAcquireUninterruptibly(final Semaphore semaphore, final int permits, final long timeout, final TimeUnit unit) {
        boolean interrupted = false;
        try {
            long remainingNanos = unit.toNanos(timeout);
            final long end = System.nanoTime() + remainingNanos;
            try {
                return semaphore.tryAcquire(permits, remainingNanos, TimeUnit.NANOSECONDS);
            }
            catch (InterruptedException e) {
                interrupted = true;
                remainingNanos = end - System.nanoTime();
            }
        }
        finally {
            if (interrupted) {
                Thread.currentThread().interrupt();
            }
        }
    }
    
    private Uninterruptibles() {
    }
}
