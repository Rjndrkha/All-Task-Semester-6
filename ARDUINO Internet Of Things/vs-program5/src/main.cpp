#include <Arduino.h>
#include <Wire.h>
#include <LiquidCrystal_I2C.h>
#include <SimpleDHT.h>

LiquidCrystal_I2C lcd(0x27, 16, 2);

#define pinDHT 3 // SD3 pin signal sensor DHT

// LED

#define RED_LED D5
#define GREEN_LED D6
#define BLUE_LED D7

byte temperature = 0;
byte humidity = 0;

SimpleDHT11 dht11(D3); // instan sensor dht11

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

void KelembabanSuhu()
{

    int err = SimpleDHTErrSuccess;

    if ((err = dht11.read(&temperature, &humidity, NULL)) != SimpleDHTErrSuccess)
    {
        Serial.print("Pembacaan DHT11 gagal, err=");
        Serial.println(err);
        delay(1000);
        return;
    }

    Serial.print("Sample OK: ");
    // CELCIUS
    Serial.print((int)temperature);
    Serial.print(" *C, ");

    // Reamur
    Serial.print((int)(4 * temperature / 5));
    Serial.print(" *R, ");

    // Kelvin
    Serial.print((int)(temperature + 273));
    Serial.print(" *K, ");

    // HUMADITY
    Serial.print("Kelembapan :  ");
    Serial.print((int)humidity);
    Serial.println(" H");

    for (int x = 0; x < 50; x++)
    {
        if (temperature <= 25)
        {
            digitalWrite(GREEN_LED, HIGH);
            delay(1500);
            digitalWrite(GREEN_LED, LOW);
            delay(150);
            lcd.setCursor(1, 1);

            lcd.print("Suhu Rendah");
            lcd.setCursor(1, 0);
            lcd.print((String)temperature + (char)223 + "C, " +
                      (String)((temperature * 9 / 5) + 32) + (char)223 + "F ");

            delay(15000);
            lcd.clear();
        }

        else if (temperature >= 25 && temperature <= 27)
        {
            digitalWrite(BLUE_LED, HIGH);
            delay(1500);
            digitalWrite(BLUE_LED, LOW);
            delay(150);
            lcd.setCursor(1, 1);

            lcd.print("Suhu Normal");
            lcd.setCursor(1, 0);
            lcd.print((String)temperature + (char)223 + "C, " +
                      (String)((temperature * 9 / 5) + 32) + (char)223 + "F ");

            delay(15000);
            lcd.clear();
        }
        else if (temperature >= 28)
        {
            digitalWrite(RED_LED, HIGH);
            delay(1500);
            digitalWrite(RED_LED, LOW);
            delay(150);

            lcd.setCursor(1, 1);
            lcd.print("Suhu Tinggi");
            
            lcd.setCursor(1, 0);
            lcd.print((String)temperature + (char)223 + "C, " +
                      (String)((temperature * 9 / 5) + 32) + (char)223 + "F ");
            
            delay(15000);
            
            lcd.clear();

            
        }
        else
        {
            Serial.println("Pembacaan DHT11 gagal, err=");
        }
        delay(500);
    }
}

void setup()
{

    pinMode(RED_LED, OUTPUT);
    pinMode(GREEN_LED, OUTPUT);
    pinMode(BLUE_LED, OUTPUT);
    Serial.begin(115200);

    lcd.init(); // initialize the lcd
    lcd.backlight();
    lcd.clear();
    lcd.home();
}

void loop()
{
    
    KelembabanSuhu();
 
}