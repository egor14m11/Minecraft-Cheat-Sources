package fun.expensive.client.feature.impl.misc;

import fun.rich.client.event.EventTarget;
import fun.rich.client.event.events.impl.player.EventUpdate;
import fun.rich.client.feature.Feature;
import fun.rich.client.feature.impl.FeatureCategory;
import fun.rich.client.feature.impl.combat.KillAura;
import fun.rich.client.utils.math.TimerHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;

import java.util.Random;

public class KillMessage extends Feature {
    public TimerHelper timerHelper = new TimerHelper();

    public KillMessage() {
        super("KillMessage", "��� ����� ����� ���-�� � ���", FeatureCategory.Misc);
    }

    @EventTarget
    public void onUpdate(EventUpdate eventUpdate) {
        if ((KillAura.target.getHealth() <= 0.0f || KillAura.target.isDead) && KillAura.target instanceof EntityPlayer) {
            String[] messages = new String[]{"�� �������� , ���� ��� �������", "�� ��� �����, ��� ������� ����", "����� ��� ������� ���� � ����� ������ ������ �� ������", "Capybara Premium�mium ���� �������, �� ������ ��� ������", "��� �� � ���� ���, �� �� ��� �� ����", "��������, ���������� �����, ������� ��� �������", "����� ���� ������, ���� ��� ���", "���� ���� ������ �������, ���� ���", "���... �� ���� ������, ���� �� ������? ������� ���))", "������ �����? ���� ���"};
            String finalText = messages[new Random().nextInt(messages.length)];
            if (timerHelper.hasReached(200)) {
                mc.player.sendChatMessage(KillAura.target.getName() + "," + " " + finalText);
                timerHelper.reset();
            }
        }
    }
}
