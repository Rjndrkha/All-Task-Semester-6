#include <Arduino.h>

#define triggerPin D2
#define echoPin D1

#define ledMerah D5
#define ledBiru D6
#define ledHijau D7

long duration, jarak;

void setup()
{
  Serial.begin(9600);

  pinMode(triggerPin, OUTPUT);
  pinMode(echoPin, INPUT);

  pinMode(ledMerah, OUTPUT);
  pinMode(ledBiru, OUTPUT);
  pinMode(ledHijau, OUTPUT);
}

void loop()
{
  digitalWrite(triggerPin, LOW);
  delayMicroseconds(2);
  digitalWrite(triggerPin, HIGH);
  delayMicroseconds(10);
  digitalWrite(triggerPin, LOW);
  duration = pulseIn(echoPin, HIGH);
  jarak = (duration / 2) / 29.1;

  Serial.print(jarak);
  Serial.println(" cm");

  if (jarak <= 100)
  {
    digitalWrite(ledMerah, HIGH);
    delay(500); // RED
    digitalWrite(ledMerah, LOW);
  }
  /*
  else if (jarak < 1000)
  {
    digitalWrite(ledBiru, HIGH);
    delay(500); // BLUE
    digitalWrite(ledBiru, LOW);
  }
  */
  else if (jarak >= 100)
  {
    digitalWrite(ledHijau, HIGH);
    delay(500); // GREEN
    digitalWrite(ledHijau, LOW);
  }
  else
  {
    digitalWrite(ledMerah, HIGH);
    digitalWrite(ledBiru, HIGH);
    digitalWrite(ledHijau, HIGH);
    delay(500);
    digitalWrite(ledMerah, LOW);
    digitalWrite(ledBiru, LOW);
    digitalWrite(ledHijau, LOW);
  }
  delay(500);
}