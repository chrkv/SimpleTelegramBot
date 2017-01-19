package simpletelegrambot

import com.pengrad.telegrambot.TelegramBot
import com.pengrad.telegrambot.TelegramBotAdapter

class SimpleController {

    def index() {
        TelegramBot bot = TelegramBotAdapter.build("BOT_TOKEN");
    }
}
