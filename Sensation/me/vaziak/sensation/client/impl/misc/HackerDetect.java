package me.vaziak.sensation.client.impl.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import me.vaziak.sensation.client.api.Category;
import me.vaziak.sensation.client.api.Module;
import me.vaziak.sensation.client.api.event.annotations.Collect;
import me.vaziak.sensation.client.api.event.events.ProcessPacketEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.play.server.S02PacketChat;

public class HackerDetect extends Module { 

    public HackerDetect() {
        super("HackerDetect", Category.MISC); 
    }

    private HashMap<EntityPlayer, Long> data = new HashMap<>();
    private List<MonitorData> monitorDataList = new ArrayList<>();

    public static ArrayList<String> simgaPhrases = new ArrayList<>(Arrays.asList(
            "YAAAA! Its rewind time, this year I want Sigma, and LeakedPVP",
            "Download Sigma to kick ass while listening to some badass music!",
            "Quick Quiz: I am zeus's son, who am I? SIGMA",
            "Bigmama and Sigmama",
            "Sigma never dies",
            "Look a divinity! He definitely must use sigma!",
            "I am not racist, but I only like Sigma users. so git gut noobs",
            "Don't piss me off or you will discover the true power of Sigma's inf reach",
            "Learn your alphabet with the sigma client: Omikron, Sigma, Epsilon, Alpha!",
            "What should I choose? Sigma or Sigma?",
            "In need of a cute present for Christmas? Sigma is all you need!",
            "Sigma client . Info is your new home",
            "I don't hack I just sigma",
            "I have a good sigma config, don't blame me",
            "Want some skills? Check out sigma client. Info!",
            "Maybe I will be Sigma, I am already Sigma",
            "Why Sigma? Cause it is the addition of pure skill and incredible intellectual abilities",
            "Wow! My combo is Sigma'n!",
            "You have been oofed by Sigma oof oof"));

    public static ArrayList<String> sigmaPenshen = new ArrayList<>(Arrays.asList(
            "完全像一个小丑一样被我打的痛苦连连",
            "你们还真是死皮赖脸的不要皮味",
            "你神爹我都不想和你说话了",
            "一个复制机还这么不知道天高地厚",
            "带着你的废物滚出妖域的视线可以么",
            "你们这样只会复制到脑里面装不进",
            "什么优美词语的健忘的脑子的一群亡命匪徒的废柴拿什么和我打",
            "非想闹个笑话给网络上的人看看你如何的自导自演",
            "如何的自我安慰吗",
            "不上台面的小人渣没有词语没有文章的废柴给我滚开好使",
            "如果你一再挑衅你爹我的耐心不要怪我大义灭亲",
            "我可以随便的开始把你打的面目全非抛尸街头了",
            "爹爹警告过你不要一再挑衅我的耐心你不听忠告",
            "现在我开始对你肆无忌惮的尽情随意殴打你残疾",
            "让我尽情的开始对你排山倒海的殴打吧废物狗仔",
            "带着你自以为很有成就的词汇和我一比高下孩子",
            "你就这样拿出了你所谓的词汇自我安慰是吗孩子",
            "请你不要拿着三年前不成熟的词汇和我一比高下",
            "看着你现在的词语逻辑混乱不堪你不觉得害臊吗",
            "呵呵拿着三年前的词汇胡拼乱凑天下无敌了是吗",
            "你可以否认你没有文化的事实那么请你拿出实力",
            "难道你所谓的实力就是低俗不堪自甘下贱是不是",
            "你那些低俗的语言让你爹爹我埋汰千百次了呵呵",
            "你看看你三三两两的词汇胡拼乱凑的词语我笑了",
            "你怎么可以妄自菲薄自称大手窝囊废的存在呵呵",
            "难道你所谓的速度就是错字连篇词不达意是不是",
            "你就是只有速度没有词汇胡言乱语盲人骑瞎马了",
            "呵呵你开始有了脾气呢小伙子你就是窝囊废嘿嘿",
            "胡言乱语胡乱敲打自以为五项全能是不是窝囊废",
            "你所谓的大手不过造谣而出你看看你的语言质量",
            "小伙子面对现实你这样的刚愎自用被人冷眼旁观",
            "追求速度的过程中你没了文化中国文字被你糟蹋",
            "作为一个中国人请你不要践踏博大精深的中国字",
            "你看看你气急败坏的敲打键盘告诉我你倍受打击",
            "一个个毫无意义的词语出现在我的屏幕深表汗颜",
            "有本事拿出你的词汇让我心服口服不要自欺欺人",
            "什么处女膜草泥马的三字经给爹爹我滚远点好使",
            "不要嘻嘻哈哈的不要脸皮的装腔作势的自不量力",
            "怎么现在和个市井流氓一样死皮赖脸的不知死活",
            "你看看你的字里行间有哪一句经过大脑不知廉耻",
            "你这些惨白无力的反抗被我反驳的所剩无几是吗",
            "你还在为你仅存的一点点尊严奋死反抗自不量力",
            "你是不是气急败坏恼羞成怒无言以对了酒囊饭袋",
            "没有文化的胡乱拼凑毫无逻辑的词语出自你双手",
            "还要怎么反驳你没有本事没有能耐的真情实相啊",
            "怎么开始猴急了呢在这样我把你打的抛尸街头了",
            "怎么妄自菲薄的零零散散的组合这么垃圾的词汇",
            "你看看你所谓的词汇真的没有什么客观价值了呢",
            "你还自以为东方不败的词汇无中生有的无端反抗",
            "你看看你现在恼羞成怒的熊样还说你能超凡脱俗",
            "你不是自以为是大手可以登峰造极唯我独尊的吗",
            "为何现在支支吾吾躲躲闪闪的逃避你被打的事实",
            "我说孩子你这样下去我可不喜欢你了啊可以滚开",
            "你怎么还是此地无银三百两的间接说你是窝囊废",
            "呵呵长江后浪推前浪你这样的人注定死在沙滩上",
            "复制机似的反复那几句没有意义词语很有必要",
            "看看你现在的样子面目狰狞想忤逆你亲爹是吗",
            "怎么开始嘻嘻哈哈现在杀了我似的对我充满仇恨",
            "你以为你那些措辞可以让你爹爹我有所感触是吗",
            "孩子我告诉你你这些言语我可以随便丢进马桶里",
            "是不是你就是你爹娘的失败之作你才这样没用的",
            "你这个天生的废材爹爹我可以把你打到七窍流血",
            "还有什么堂而皇之的借口反驳你爹爹高高在上啊",
            "孩子你不要惹是生非爹爹我打得你低三下四了啊",
            "你开始向我摇尾乞怜让我高抬贵手了废物二卡子",
            "你的飞扬跋扈不可一世被你苟且偷生的代替了啊",
            "是不是被我打的不可见人支支吾吾的胡言乱语了",
            "残缺不全的肢体怎么可以承受住排山倒海的进攻",
            "自以为是的高傲自大只会被无情的殴打谢绝人世",
            "你以为你真的才华横溢秒世绝笔了是不是窝囊废",
            "我现在可以高高在上的说你就是我手下败将呵呵",
            "你现在所有的话都是胡言乱语躲躲闪闪气急败坏",
            "你狼狈不堪的继续苟延残喘企图抱住你奄奄一息",
            "你开始回光返照的继续和我抗争到底了你这孩子",
            "你看看你现在还有什么脸面继续和我颠倒黑白呢",
            "狗急跳墙的和我诉说你内心的恐惧与不安是不是",
            "孩子我真怕你不要性命被我打的心脏心律不齐了",
            "现在你有没有恼羞成怒告诉我可以吗你这个废物",
            "心跳加快畏惧你爹爹了是不是你这个不肖子孙啊",
            "你想向你爹爹我下跪你羞涩难以启齿是不是孩子",
            "你可以否认你被我打败但是事实你已经气急败坏",
            "你开始像疯狗一样的对我穷追不放你丧失人性了",
            "我可以说你是个废物吗你除了颠倒黑白还会什么",
            "你真的恶心到我了你这个不要脸皮的下贱痞子货"
    ));

    private long lastNotify;

    @Override
    public void onEnable() {
        monitorDataList.clear();
        String[] exhiKillsults = {"Wow, you just died in a block game", "died in a block game lmfao.", "died for using an android device. LOL", "your mother is of the homophobic type", "That's a #VictoryRoyale!, better luck next time", "used Flux then got backhanded by the face of hypixel", "even loolitsalex has more wins then you", "my grandma plays minecraft better than you", "you should look into purchasing vape", "What's worse your skin or the fact your a casual f3ckin normie", "blind gamers deserve a chance too. I support you.", "that was a pretty bad move", "how does it feel to get stomped on", "do you really like dying this much?", "and jake paul, id choose jake paul", "what does your IQ and kills have in common? They are both low af", "want some PvP advice?", "wow, you just died in a game about legos", "i'm surprised that you were able hit the 'Install'", "I speak English not your gibberish.", "Take the L, kid", "got memed", "is a default skin!!!1!1!1!1!!1!1", "You died in a fucking block game", "likes anime", "Trash dawg, you barely even hit me.", "I just fucked him so hard he left the game", "get bent over and fucked kid", "couldn't even beat 4 block", "Someone get this kid a tissue,", "'s dad is bald", "Your family tree must be a cactus because everybody on it is a prick.", "You're so fucking trash that the binman mistook you for garbage and collected you in the morning", "some kids were dropped at birth but you were clearly thrown at a wall", "go back to your mother's womb you retarded piece of shit", "Thanks for the free kill", "Benjamin's forehead is bigger than your future Minecraft PvP career", "are you even trying?", "You. Are. Terrible.", "my mom is better at this game then you", "lololololol mad? lololololol", "/friend me so we can talk about how useless you are", "\"Staff! Staff! Help me! I am dogcrap at this game and i am getting rekt!\"", "Is it really that hard to trace me while i'm hopping around you?", "Vape is a cool thing you should look into!", "I'm not using reach, you just need to click faster.", "I hope you recorded that, so that you can watch how trash you really are.", "You have to use the left and right mouse button in this game, in case you forgot.", "I think that the amount of ping you have equates to your braincells dumbfuck asshat", "ALT+F4 to remove the problem", "alt+f4 for hidden perk window", "You'll eventually switch back to Fortnite again, so why not do it now?", "go back to fortnite where you belong, you degenerate 5 year old", "I'll be sure to Orange Justice the fucck out of your corpse", "Exhibob better than you!1", "I'm a real gamer, and you just got owned!!", "Take a taste of your own medicine you clapped closet cheater", "go drown in your own salt", "go and suck off prestonplayz, you 7 yr old fanboy", "how are you so bad. I'm losing brain cells just watching you play", "Jump down from your school building with a rope around your neck.", "dominated, monkey :dab:", "Please add me as a friend so that you can shout at me. I live for it.", "i fvcked your dad", "Yeah, I dare you, rage quit. Come on, make us both happy.", "No, you are not blind! I DID own you!", "easy 10 hearted L", "It's almost as if i can hear you squeal from the other side!", "If you read this, you are confirmed homosexual", "have you taken a dump lately? Because I just beat the shit of out you.", "6 block woman beater", "feminist demolisher", "chromosome count doubles the size of this game", "a million years of evolution and we get", "you're so fat that when you had a fire in your house you dialled 999 on the microwave", "is a Fluxuser", "is a Sigmauser", "I suffer from these fukking kicks, grow brain lol", "a crack user", "Hypixel thought could stop us from cheating, huh, you are just as delusional as him", "GET FUCKED IM ON BADLION CLIENT WHORE", "should ask tene if i was hacking or not", "check out ARITHMOS CHANNEL", "I play fortnite duos with your mom", "Lol commit not alive", "How'd you hit the DOWNLOAD button with that aim?", "I'd say your aim is cancer, but at least cancer kills people", "is about as useful as pedals on a wheelchair", "aim is now sponsored by Parkinson's!", "I'd say uninstall but you'd probably miss that too.", "I bet you edate.", "you probably watch tenebrous videos and are intruiged", "Please could you not commit not die kind sir thanks", "you probably suck on door knobs", "go commit stop breathing u dumb idot", "go commit to sucking on door knobs", "the only way you can improve at pvp %s is by taking a long walk off a short pier", "Does not have a good client", "client refused to work", ":potato:", "Super Mario Bros. deathsound", "and tell them how trash they are", "Just do a France 1940, thank you" , "You mum your dad the ones you never had", "please be toxic to me, I enjoy it", "knock knock, FBI open up, we saw you searched for cracked vape.", "plez commit jump out of window for free rank", "you didn't even stand a chance!", "you're the type of player to get 3rd place in a 1v1", "I'm not saying you're worthless, but I would unplug your life support to charge my phone", "I didn't know dying was a special ability", "Stephen Hawking had better hand-eye coordination than you", "kids like you were the inspiration for birth control", "you're the definition of bane", "lol bad client what is it exhibition?", "L what are you lolitsalex?", "tene is my favorite youtuber and i bought his badlion client clock so i'm legit", "Don't forget to report me", "Your IQ is that of a Steve", "have you taken a dump lately? Because I just beat the shit of out you.", "dont ever put bean in my donut again.", "2 plus 2 is 4, minus 1 that's your IQ", "I think you need vape", "You just got oneTapped LUL", "You're the inspiration for birth control", "I don't understand why condoms weren't named by you.", "My blind grandpa has better aim than you.", "Exhibob better then you!", "Exhibition >", "your parents abondoned you, then the orphanage did the same", "stop using trash client like sigma.", "your client is worse than sigma, and that's an achievement", "ur fatter than Napoleon", "please consider not alive", "probably bought sigma premium", "probably asks for sigma premium keys", "the type of person to murder someone and apologize saying it was a accident", "you're the type of person who would quickdrop irl", "got an F on the iq test.", "Don't forget to report me", "even viv is better than you LMAO", "your mom gaye", "I Just Sneezed On Your Forehead", "your teeth are like stars - golden, and apart.", "Rose are blue, stars are red, you just got hacked on and now you're dead", "i don't hack because watchdog is watching so it would ban me anyway.", "chill out on the paint bro", "You got died from the best client in the game, now with Infinite Sprint bypass", "you're so fat, that your bellybutton reaches your house 20 minutes before you do", "your dick is so small, that you bang cheerios"};
        for (String s : exhiKillsults) {
            monitorDataList.add(new MonitorData(s, "Exhibition"));
        }
    
        for (String s : simgaPhrases) {
            monitorDataList.add(new MonitorData(s, "Sigma"));
        }
        for (String s : sigmaPenshen) {
            monitorDataList.add(new MonitorData(s, "Sigma"));
        }
		String[] sensationWeebo = new String[]{
				"Sensation " + "b32" + ", killing watchdog",
				"Sensation " + "b33" + ", killing watchdog",
				"Sensation " + "b34" + ", killing watchdog",
				"Sensation " + "b35" + ", killing watchdog",
				"Imagine using any client but sensation.",
				"Running away and using pearls to get away from cheater < falling in void",
				"It appears you just took the L",
				"Imagine using sigma, honestly some people.",
				"Seriously stop using crap clients, use sensation",
				"Sensation client by vaziak!",
				"Stop using moon and exhi smh",
				"Why use remix 1.4 if you can use sensation",
				"If your client can't atleast 1 heart sensation, its garbage m8",
				"Moon client got a banning autoblock LOL"};
        for (String s : sensationWeebo) {
            monitorDataList.add(new MonitorData(s, "Sensation"));
        }
    }

    @Override
    protected void onDisable() {
        monitorDataList.clear();
        data.clear();
    }

    @Collect
    public void onPacket(ProcessPacketEvent event) {
        if (mc.thePlayer != null && mc.theWorld != null) {
            if (event.getPacket() instanceof S02PacketChat) {
                S02PacketChat s02PacketChat = (S02PacketChat) event.getPacket();
                String txt = s02PacketChat.getChatComponent().getUnformattedText().replace("&", "").replace("§", "");
                for (MonitorData monitorData : monitorDataList) {
                    if (!txt.contains(mc.session.getUsername()) && txt.contains(monitorData.stringToCheck) && (System.currentTimeMillis() - lastNotify) > 1000L) {
                    	//((Notifications) Sensation.instance.cheatManager.getCheatRegistry().get("Notifications")).notificationData.add(new NotificationData(monitorData.clientName, System.currentTimeMillis(), NotificationType.HACKER));
                		
                        lastNotify = System.currentTimeMillis();
                        break;
                    }
                }
            }
        }
    }


    public class MonitorData {
        private String stringToCheck, clientName;

        public MonitorData(String stringToCheck, String clientName) {
            this.stringToCheck = stringToCheck;
            this.clientName = clientName;
        }
    }
}