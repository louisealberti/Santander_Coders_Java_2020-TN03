window.onload = function () {

    // Eventos: Exercício #2
    document.getElementById('greeting').onclick = function () {
        alert("olá");
    };

    // Eventos: Exercício #3
    document.getElementById('page-bg').onclick = function () {
        document.body.style.backgroundColor = "green";
    };

    // Eventos: Exercício #4
    document.getElementById('img1').onmouseover = function () {
        console.log("estou vendo a imagem");
    };

    // Eventos: Exercício #5 e #9 
    document.getElementById('img2').addEventListener('click', function () {
        console.log("estou clicando na imagem " + "(" + event.clientX + "," + event.clientY + ")");
    });

    // Eventos: Exercício #6
    function redBackground() {
        this.style.backgroundColor = 'red';
    };
    document.body.addEventListener('click', redBackground);

    // Eventos: Exercício #7  
    document.getElementById('stop-listening').addEventListener('click', function () {
        document.body.removeEventListener('click', redBackground);
        if (document.body.style.backgroundColor == 'red') {
            document.body.style.backgroundColor = 'white';
        }
    });

    // Eventos: Exercício #8
    document.getElementById('google').onclick = function () {
        window.location.href = 'http://www.google.com.br';
    };

    document.getElementById('submit').onclick = function () {
        alert("Não é possível enviar");
    };

    // Timer: Exercício #1
    setTimeout(function () {
        alert("tempo esgotado!");
    }, 10000);

    // Timer: Exercício #2
    setInterval(function () {
        alert("hora do intervalo");
    }, 5000);

};