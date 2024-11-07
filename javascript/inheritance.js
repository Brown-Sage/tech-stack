// class human{
//     constructor(type, age) {
//         this.type = type;
//         this.age = age;
//     }
//         speak(){ console.log(`this is human and type is ${this.type} and age is ${this.age}`); }
// }
// class subhuman extends human{
//     constructor(type, age) {
//         super(type,age);
//     }
//     speak(){console.log(`this is subhuman and type is ${this.type} and age is ${this.age}`);}
// }
// sub = new subhuman("low", 23);
// hum = new human("high", 24)
// sub.speak();
// hum.speak();


class animal{
    eat() { console.log(`eating ${this.name}`); };
    sleep() { console.log(`${this.name} is sleeping`); };
}
class fish extends animal{
    name = "fish";
}
class snake extends animal{
    name = "snake";
}
snake1 = new snake();
fish1 = new fish();
fish1.eat();
snake1.sleep();
