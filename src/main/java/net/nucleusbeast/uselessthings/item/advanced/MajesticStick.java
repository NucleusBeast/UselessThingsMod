package net.nucleusbeast.uselessthings.item.advanced;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.LiteralText;
import net.minecraft.util.ActionResult;

import java.util.Random;

public class MajesticStick extends Item {
    public MajesticStick(Settings settings) {
        super(settings);
    }

    String[] message= {" is the best name ever! %player%", "You are wonderfull!", "You are loved"};

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {

        if (context.getWorld().isClient()){
            PlayerEntity player = context.getPlayer();
            if (player != null){
                Random rand = new Random();
                int roll = rand.nextInt(message.length);
                if (roll == 0){

                    player.sendMessage(new LiteralText(player.getName().asString() + message[0]), false);
                }
                else {
                    player.sendMessage(new LiteralText(message[roll]), false);
                }
            }
        }

        context.getStack().damage(1, context.getPlayer(), (player) -> player.sendToolBreakStatus(player.getActiveHand()));
        return super.useOnBlock(context);
    }
}
