/*

#include <Arduino.h>
#define RED_LED D5 //led warna merah
#define GREEN_LED D6 //led warna hijau
#define BLUE_LED D7
#define LED D0

void setup() {
Serial.begin(115200);
pinMode(RED_LED,OUTPUT);//atur pin-pin digital sebagai output
pinMode(GREEN_LED,OUTPUT);
pinMode(BLUE_LED,OUTPUT);

pinMode(LED,OUTPUT);
Serial.println("Contoh Program LED RGB");
}

void rgbLED(){
digitalWrite(GREEN_LED, HIGH);
delay(1000);
digitalWrite(GREEN_LED, LOW);
delay(1000);
}

void loop() {
rgbLED();
  digitalWrite(LED,HIGH);
  delay(1000);
  
  digitalWrite(LED,LOW);
  delay(1000);
}
*/