const info = {
    hmm1: function () {
        console.log("hmm1");
        return this;
    },
    hmm2: () => {
        console.log("hmm2");
        return this;
    }
};
info.hmm1().hmm2();
function func1() {
    return 2;
}

// function func2() {
//     return 4;
// }
const func2 = () => 4;  // Implicit return
let a = (func1(), func2())

console.log(a);

