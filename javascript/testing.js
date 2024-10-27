function myName(name){
    console.log('Hi, my name is ', name);
    
}

function myCallback(name, dk){
    console.log('and this is how callbacks work!');
    dk(name);
}


myCallback('hanma', myName);

// different Thing
greet = ()=> console.log("Hello}!"); 
greet();
