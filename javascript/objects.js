// const aaryan = new Object();
// aaryan.age = 22;
// aaryan.name = "aaryan"
// aaryan.w = true;
// aaryan.func = function () { console.log(`my name is ${this.name} and my age is ${this.age} and am i W ? = ${this.w}`) };
// aaryan.func();

// function human(name, age) {
//     // this.name = "aaryan"
//     // this.age = 23
//     this.name = name;
//     this.age = age;
//     this.greet = function () {
//         console.log(this.name , this.age);
//     };
// }
// human1 = new human("dk", 34);
// human2 = new human("hmm", 23)
// human1.greet();
// human2.greet();



// class dk {
//     constructor(name, age) {
//         // this.name = "aaryan"
//         // this.age = 23
//         this.name = name;
//         this.age = age;
//     }
//     greet = function () {
//         console.log(this.name, this.age);
//     };
// }
// human1 = new dk("dk", 34);
// human2 = new dk("hmm", 23);
// human1.greet();

const person1 = {
    name: "aryan",
    age: 22, 
    W: true
}
const person2 = {
    name: "nikit",
    age: 21, 
    W:false
}
console.log(person1.name);
console.log(person2.W);