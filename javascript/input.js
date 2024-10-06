let username;
document.getElementById("click").onclick = function () {
    username = document.getElementById("myname").value;
    document.getElementById("myh1").textContent = `hello, ${username}`;
}