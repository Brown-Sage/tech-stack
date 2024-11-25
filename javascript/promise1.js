function aaryanW() {
    return new Promise((resolve, reject) => {
        resolve("aryan is W"); 
    });
}
function NikitW() {
    return new Promise((resolve, reject) => {
        resolve("nikit is W"); 
    });
}
function mayankW() {
    return new Promise((resolve, reject) => {
        resolve("mayank is W"); 
    });
}

mayankW()
    .then(value => { console.log(value); return aaryanW() })
    .then(value => { console.log(value); return NikitW(); })
    .then(value => { console.log(value); console.log("It's Over") })

//BTW ALL OF THIS FOR AVOIDING THE CALLBACK HELL
    
// function mayankW(callback) {
//     console.log("w mayank");
//     callback()
// }
// function aaryanW(callback) {
//     console.log("w aaryan");
//     callback();
// }
// function nikitW() {
//     console.log("W nikit lodu");
    
// }
// aaryanW(() =>
//     mayankW(() =>
// nikitW()))