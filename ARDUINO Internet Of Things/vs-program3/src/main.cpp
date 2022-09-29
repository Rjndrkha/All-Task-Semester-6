  #include <Arduino.h>
    #include <SimpleDHT.h>

    #define pinDHT 7 // SD3 pin signal sensor DHT

    //LED

    #define RED_LED D1
    #define GREEN_LED D2
    #define BLUE_LED D3


    byte temperature = 0;
    byte humidity = 0;

    SimpleDHT11 dht11(D7); //instan sensor dht11

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
        
        //CELCIUS
        Serial.print((int)temperature);
        Serial.print(" *C, ");

        //Reamur 
        Serial.print((int)(4*temperature/5));
        Serial.print(" *R, ");

        //Kelvin 
        Serial.print((int)(temperature+273));
        Serial.print(" *K, ");

        //HUMADITY
        Serial.print("Kelembapan :  ");
        Serial.print((int)humidity);
        Serial.println(" H");

        delay(1500);

        if(temperature <= 25){
            digitalWrite(RED_LED,LOW);
            digitalWrite(GREEN_LED,HIGH);
            digitalWrite(BLUE_LED,LOW);
            Serial.print(" =============");
            Serial.print(" Warning Suhu Rendah!! ");
            Serial.println(" =============");

        }else if(temperature >=25 && temperature <= 27){
            digitalWrite(RED_LED,LOW);
            digitalWrite(GREEN_LED,LOW);
            digitalWrite(BLUE_LED,HIGH);
            Serial.print(" =============");
            Serial.print(" Warning Suhu Normal!! ");
            Serial.println(" =============");


        }else if(temperature >=28 ){
            digitalWrite(RED_LED,HIGH);
            digitalWrite(GREEN_LED,LOW);
            digitalWrite(BLUE_LED,LOW);
            Serial.print(" =============");
            Serial.print(" Warning Suhu Tinggi!! ");
            Serial.println(" =============");

        }else{
            Serial.println("Pembacaan DHT11 gagal, err=");
        }



        
    }

    void setup()
    {
        Serial.begin(115200);
        Serial.println("Simple DHT");
        pinMode(RED_LED,OUTPUT);
        pinMode(GREEN_LED,OUTPUT);
        pinMode(BLUE_LED,OUTPUT);
        delay(1000);
        
    }

    void loop()
    {
        KelembabanSuhu();
    }