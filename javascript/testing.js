// function myName(name){
//     console.log('Hi, my name is',name);
    
// }

// function myCallback(name, dk){
//     console.log('and this is how callbacks work!');
//     dk(name);
// }


// myCallback('hanma', myName);

// // different Thing
// greet = ()=> console.log("Hello}!"); 
// greet();
// let num = [1, 3, 5, 78];
// console.log(num.map(num=>num));

// different 
function greet(name) {
    console.log("my name is", name);
}

function nameprovider(callback) {
    const name = "Kanika";
    callback(name);
}

nameprovider(greet);