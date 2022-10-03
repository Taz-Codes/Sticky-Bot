package bot.command;

import net.dv8tion.jda.api.events.interaction.ModalInteractionEvent;
import net.dv8tion.jda.api.events.interaction.command.MessageContextInteractionEvent;
import net.dv8tion.jda.api.events.interaction.component.ButtonInteractionEvent;
import net.dv8tion.jda.api.events.interaction.component.SelectMenuInteractionEvent;
import org.jetbrains.annotations.NotNull;

public interface MessageCommand {
    void run(MessageContextInteractionEvent event);
    String getName();

    default void onButtonInteraction(@NotNull ButtonInteractionEvent event) { }
    default void onSelectMenuInteraction(@NotNull SelectMenuInteractionEvent event) { }
    default void onModalInteraction(@NotNull ModalInteractionEvent event) { }
}
