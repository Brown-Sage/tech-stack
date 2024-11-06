const num = [1, 2, 5, 4, 7];
const square = num.map((element) => Math.pow(element, 2));
const cube = num.map((element) => Math.pow(element, 3));
const even = num.filter((element) => element % 2 === 1);
function start() {
    setTimeout(() => {
        odd = num.filter((element) => element % 2 === 0);
        console.log(odd);
    }, 3000);
}
function cb(callback) {
    console.log("this is a callback function");
    callback();
}

console.log(square);
console.log(cube);
console.log(even);
cb(start);