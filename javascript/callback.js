hi(yo);
function yo(callback) {
    console.log("yo");
    callback();
}
function hi(callback) {
    console.log("hi");
    callback(hey);
}
function hey() {
    console.log("hey");

}

