int a = 2;
int b = 3;
int c = 4;
int d = 5;
int e = 6;
int f = 7;
int g = 8;
int boton = 10;
int contador = 0;
int tiempo=1000;

void setup() {

  Serial.begin(9600);
  pinMode(a, OUTPUT);   
  pinMode(b, OUTPUT);
  pinMode(c, OUTPUT);
  pinMode(d, OUTPUT);
  pinMode(e, OUTPUT);
  pinMode(f, OUTPUT);
  pinMode(g, OUTPUT);
  pinMode(boton, INPUT); 

}
void loop() {
 

  digitalWrite(a,HIGH); 
  digitalWrite(b,HIGH); 
   digitalWrite(c,HIGH); 
    digitalWrite(d,HIGH); 
     digitalWrite(e,HIGH);
     digitalWrite(f,HIGH);
     digitalWrite(g,HIGH);
      delay(tiempo);
     digitalWrite(a,HIGH); 
  digitalWrite(b,HIGH); 
   digitalWrite(c,HIGH); 
    digitalWrite(d,LOW); 
     digitalWrite(e,HIGH);
     digitalWrite(f,HIGH);
     digitalWrite(g,HIGH);//A
         delay(tiempo);
  digitalWrite(a,HIGH); 
  digitalWrite(b,HIGH); 
   digitalWrite(c,HIGH); 
    digitalWrite(d,HIGH); 
     digitalWrite(e,HIGH);
     digitalWrite(f,HIGH);
     digitalWrite(g,HIGH);//B
      delay(tiempo);
        digitalWrite(a,HIGH); 
  digitalWrite(b,LOW); 
   digitalWrite(c,LOW); 
    digitalWrite(d,HIGH); 
     digitalWrite(e,HIGH);
     digitalWrite(f,HIGH);
     digitalWrite(g,LOW);//C
       delay(tiempo);
        digitalWrite(a,HIGH); 
  digitalWrite(b,HIGH); 
   digitalWrite(c,HIGH); 
    digitalWrite(d,HIGH); 
     digitalWrite(e,HIGH);
     digitalWrite(f,HIGH);
     digitalWrite(g,LOW);//D
       delay(tiempo);
      digitalWrite(b, LOW);
      digitalWrite(c, LOW);
      digitalWrite(d, HIGH);
      digitalWrite(e, HIGH);
      digitalWrite(f, HIGH);
      digitalWrite(g, HIGH);//E
  delay(tiempo);
      digitalWrite(a, HIGH);
      digitalWrite(b, LOW);
      digitalWrite(c, LOW);
      digitalWrite(d, LOW);
      digitalWrite(e, HIGH);
      digitalWrite(f, HIGH);
      digitalWrite(g, HIGH);//F
        delay(tiempo);
      digitalWrite(a, HIGH);
      digitalWrite(b, LOW);
      digitalWrite(c, HIGH);
      digitalWrite(d, HIGH);
      digitalWrite(e, HIGH);
      digitalWrite(f, HIGH);
      digitalWrite(g, HIGH);//G
       delay(tiempo);
      digitalWrite(a, LOW);
      digitalWrite(b, HIGH);
      digitalWrite(c, HIGH);
      digitalWrite(d, LOW);
      digitalWrite(e, HIGH);
      digitalWrite(f, HIGH);
      digitalWrite(g, HIGH);//H
      delay(tiempo);
      digitalWrite(a, LOW);
      digitalWrite(b, LOW);
      digitalWrite(c, LOW);
      digitalWrite(d, HIGH);
      digitalWrite(e, HIGH);
      digitalWrite(f, HIGH);
      digitalWrite(g, LOW);//L
         delay(tiempo);
      digitalWrite(a, HIGH);
      digitalWrite(b, HIGH);
      digitalWrite(c, HIGH);
      digitalWrite(d, HIGH);
      digitalWrite(e, HIGH);
      digitalWrite(f, HIGH);
      digitalWrite(g, LOW);//O
  delay(tiempo);
    digitalWrite(a, HIGH);
      digitalWrite(b, HIGH);
      digitalWrite(c, LOW);
      digitalWrite(d, LOW);
      digitalWrite(e, HIGH);
      digitalWrite(f, HIGH);
      digitalWrite(g, HIGH);//P
  
     delay(tiempo);
        digitalWrite(a, HIGH);
      digitalWrite(b, LOW);
      digitalWrite(c, HIGH);
      digitalWrite(d, HIGH);
      digitalWrite(e, LOW);
      digitalWrite(f, HIGH);
      digitalWrite(g, HIGH);//S
  delay(tiempo);
  
   
  if(digitalRead(boton)==HIGH){
  digitalWrite(a,HIGH); 
  digitalWrite(b,HIGH); 
   digitalWrite(c,HIGH); 
    digitalWrite(d,HIGH); 
     digitalWrite(e,HIGH);
     digitalWrite(f,HIGH);
     digitalWrite(g,HIGH);
    delay(1000);
      
  }

}
  
