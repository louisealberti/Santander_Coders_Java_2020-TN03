var campos = document.getElementById('form1').elements;
var size = campos.length;
var regexEmpty = /^[a-z0-9]+$/i;

// ------------------------| Exercício #1 |--------------------------------- //
document.getElementById('submit').addEventListener("click", () => {
    for (let i = 0; i < size - 1; i++) {
        console.log(campos[i].value);
    }
});

document.getElementById('submit').addEventListener("click", () => {
    // --------------------| Exercício #1a |-------------------------------- //
    for (let i = 0; i < size - 1; i++) {
        if (campos[i].value === '') {
            alert("O campo " + campos[i].placeholder + " é obrigatório");
        };
    }
    // --------------------| Exercício #1b |-------------------------------- //
    if (document.getElementById('password1').value != document.getElementById('password2').value) {
        alert("As senhas não são iguais!");
    }
});




