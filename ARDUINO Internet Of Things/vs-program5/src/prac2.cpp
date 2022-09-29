/*
#include <Arduino.h>
#include <Wire.h>
#include <LiquidCrystal_I2C.h>

LiquidCrystal_I2C lcd(0x27, 16, 2);

void setup()
{
    lcd.init(); // initialize the lcd
    lcd.backlight();
    lcd.clear();
    lcd.home();
}
void scrollText(int row, String message, int delayTime, int lcdColumns)
{
    for (int i = 0; i < lcdColumns; i++)
    {
        message = " " + message;
    }
    message = message + " ";
    for (int pos = 0; pos < message.length(); pos++)
    {
        lcd.setCursor(0, row);
        lcd.print(message.substring(pos, pos + lcdColumns));
        delay(delayTime);
    }
}
void loop()
{
    lcd.home();
    lcd.print("Hallo");
    scrollText(1, "By : Rajendra Rakha", 250, 16);
    
    scrollText(3, "Bertemu denganku, ku bertemu kamu", 150, 16);
    scrollText(4, "Sepertimu yang kucari", 100, 16);
    scrollText(5, "Konon aku juga s'perti yang kaucari", 160, 16);
    scrollText(6, "Kukira kita asam dan garam", 160, 16);
    
}
*/