package me.nohet.mobeffects.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Random;

public class MobKill implements Listener {

    @EventHandler
    public void onDeath(EntityDeathEvent e) {
        Player killer = e.getEntity().getKiller();

        if (killer != null) {
            PotionEffectType[] potionEffects = {PotionEffectType.SLOW_FALLING, PotionEffectType.INCREASE_DAMAGE,
                    PotionEffectType.DAMAGE_RESISTANCE, PotionEffectType.SPEED, PotionEffectType.JUMP,
                    PotionEffectType.GLOWING, PotionEffectType.INVISIBILITY, PotionEffectType.REGENERATION};

            Random rand = new Random();

            int randomNumber = rand.nextInt(potionEffects.length);
            PotionEffectType randomEffect = potionEffects[randomNumber];

            killer.addPotionEffect(new PotionEffect(randomEffect, 600, 0));
        }
    }
}