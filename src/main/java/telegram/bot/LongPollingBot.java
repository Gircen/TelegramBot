package telegram.bot;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Component
public class LongPollingBot extends TelegramLongPollingBot {
    @Value("${bot.name}")
    @Getter
    private String botUsername;

    @Value("${bot.token}")
    @Getter
    private String botToken;

    @Override
    public void onUpdateReceived(Update update) {
        try {
//            SendMessage sendMessage = new SendMessage();
//            sendMessage.setChatId(String.valueOf(update.getMessage().getChatId()));
//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append("hi ").append(update.getMessage().getChat().getFirstName()).append(" ").append(update.getMessage().getChat().getLastName());
//            sendMessage.setText(stringBuilder.toString());
//            execute(sendMessage);

        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
