����   = b  javalearn/Loops_exp  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Ljavalearn/Loops_exp; main ([Ljava/lang/String;)V  java/util/ArrayList
  	
    java/lang/Integer   valueOf (I)Ljava/lang/Integer;
     add (Ljava/lang/Object;)Z	     java/lang/System ! " out Ljava/io/PrintStream; $ Ikiye tam bolunen sayilar :
 & ( ' java/io/PrintStream ) * print (Ljava/lang/String;)V
  , - . iterator ()Ljava/util/Iterator; 0 2 1 java/util/Iterator 3 4 next ()Ljava/lang/Object;
  6 7 8 intValue ()I : java/lang/StringBuilder <  
 9 >  *
 9 @ A B append (I)Ljava/lang/StringBuilder;
 9 D E F toString ()Ljava/lang/String; 0 H I J hasNext ()Z
 & L M  println O Ikiye tam bolunemeyen sayilar : args [Ljava/lang/String; 	myNumbers [I 	bolenList Ljava/util/ArrayList; bolmeyenList numbers I bolenler bolmeyenler LocalVariableTypeTable *Ljava/util/ArrayList<Ljava/lang/Integer;>; StackMapTable Q S 
SourceFile Loops_exp.java !               /     *� �    
                    	      =    �
Y-OYbOY+OYcOYVOY[OYOYWOL� Y� M� Y� N+Y:�66� +.6p� ,� � W� -� � W���Բ #� %,� +:� )� / � � 56� � 9Y;� =� ?� C� %� G ��Ӳ � K� N� %-� +:� )� / � � 56� � 9Y;� =� ?� C� %� G ��ӱ    
   N     0  8  @  T  [  e  h  r  |  �  �  �  �  �  �  �   �  #    H    P Q   0 � R S  8 � T U  @ � V U  T  W X  �  Y X  �  Z X  [     8 � T \  @ � V \  ]   h � M  ^ _    _  �   ^ _   _  � 	  ^ _    _  �   ^ _    0  % %  `    a