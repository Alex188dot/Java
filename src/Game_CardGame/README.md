## Card Game

This card game is a fun representation of Interfaces in Java.  

There are 3 warriors in this game: Hero, Vampire and Werewolf. All classes extend the Character class and implement either the Human or Monster interfaces. The only character which implements both is the Werewolf,   
who thanks to the full moon can transform into a Wolf (thus using the Monster "bite" method), while during the crescent moon he is a Human (thus capable of using the "fight" method). All characters start with 15 Health points.

Below a demo of how it works. The program will prompt the user to choose between Hero, Vampire or Werewolf by pressing 1, 2 or 3:

<img width="2092" alt="Screenshot 2023-10-20 at 11 34 12" src="https://github.com/Alex188dot/Java-and-PHP/assets/117444853/fb1ea5c9-5f24-47ed-95c5-f16553aabf56">

After the choice the program will randomly assign Player 2 a character and depending on how strong their attack is, the player with the highest Health remaining at the end of the attack wins:

<img width="2085" alt="Screenshot 2023-10-20 at 11 33 59" src="https://github.com/Alex188dot/Java-and-PHP/assets/117444853/6ee0f741-5eec-4373-92b8-ec4fb2102d05">

<img width="2081" alt="Screenshot 2023-10-20 at 11 33 45" src="https://github.com/Alex188dot/Java-and-PHP/assets/117444853/67c2dee3-df10-49b5-9d76-ac0305a34e34">

The Werewolf as mentioned before is a special character as he can take 2 forms: either Monster (during full moon) or Human (during crescent moon). Below you can see how against the same character  
in its Werewolf form, he wins against the Vampire, while in his human form, he loses against the Vampire:

<img width="2083" alt="Screenshot 2023-10-20 at 11 34 27" src="https://github.com/Alex188dot/Java-and-PHP/assets/117444853/f04b84cf-7315-41e6-b2e8-ab97bdc78e43">

<img width="2103" alt="Screenshot 2023-10-20 at 11 34 39" src="https://github.com/Alex188dot/Java-and-PHP/assets/117444853/36b9e1ef-0904-47dd-a2ce-a7dd7d04e771">
