package net.ben.testmod.event;

import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingSetAttackTargetEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;


public class MyEvent {

    @SubscribeEvent
    public void onEntitySpawn(EntityJoinLevelEvent event) {
        if (event.getEntity() instanceof LivingEntity) {
            doTaskStuff((LivingEntity) event.getEntity(), event);
        }


    }

    private void doTaskStuff(LivingEntity ev, Event event)
    {
        if (ev instanceof Animal){
            //((Animal) ev).targetSelector.addGoal(0, new NearestAttackableTargetGoal<>(((Animal) ev), Player.class, true));
            //((Animal) ev).goalSelector.addGoal(0, new MeleeAttackGoal(((Animal) ev), 10.0D, false));
            ((Animal) ev).goalSelector.removeAllGoals();
        }
    }

}
