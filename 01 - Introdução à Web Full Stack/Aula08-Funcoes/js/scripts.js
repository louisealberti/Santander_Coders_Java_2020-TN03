
/* 1.Crie uma função que recebe um número e verifica se ele é par ou ímpar */

function parOuImpar(n) {
    if (n % 2 == 0) {
        console.log(n + " é par");
    } else {
        console.log(n + " é impar");
    }
}

// for(let i = 0; i < 10; i++) {
//     parOuImpar(i);
// }


/* 2.Crie uma arrow function que receba um número e verifique se é primo */

var ehPrimo = n => {
    if (n < 2) return n + " não é primo";
    for (let i = 2; i < n; i++) {
        if (n % i === 0) {
            return n + " não é primo";
        }
    }
    return n + " é primo";
}

// for(let i = -2; i < 20; i++) {
//     console.log(ehPrimo(i));
// }

/* 3.Crie uma função que imprime de 10 até 1 e depois imprime 
     na tela "feliz ano novo" através de uma callback */

function contador(callback) {
    var t = 0;
    for(let i = 10; i > 0; i--) {
        function timing(n) {
            t += 1000;
            setTimeout( () => {console.log(n);}, t);
        }
        timing(i);
    }
    setTimeout( () => {callback();}, 10000);
}

function felizAnoNovo() {
    setTimeout( () => {
        console.log("Feliz ano novo!!!");
    }, 1000);
}

contador(felizAnoNovo);

/* 4.Faça o mesmo utilizando Promise com concatenação de then */

const countdown = n => new Promise((resolve, reject) => {
    setTimeout(() => {
        resolve(n - 1);
    }, 1000);
});

const newYearMessage = new Promise((resolve, reject) => {
    resolve('Feliz ano novo!!!');
});

countdown(11).then(res => {
    console.log(res);
    return countdown(res);
}).then(res => {
    console.log(res);
    return countdown(res);
}).then(res => {
    console.log(res);
    return countdown(res);
}).then(res => {
    console.log(res);
    return countdown(res);
}).then(res => {
    console.log(res);
    return countdown(res);
}).then(res => {
    console.log(res);
    return countdown(res);
}).then(res => {
    console.log(res);
    return countdown(res);
}).then(res => {
    console.log(res);
    return countdown(res);
}).then(res => {
    console.log(res);
    return countdown(res);
}).then(res => {
    console.log(res);
    return countdown(res);
}).then(() => {
    return newYearMessage;
}).then(res => {
    console.log(res);
});

/* 5.Agora repita a função utilizando o método async/await */

const newYearCounter = async() => {
    try{
        const message = await newYearMessage;
        for(let i = 11; i > 1; i--) {
            console.log(await countdown(i));
        }
        setTimeout( () => {console.log(message);}, 1000);
    } catch(err) {
        console.log(err);
    }
}

 newYearCounter();

/* 6.Crie um array com as seguintes notas [5.3, 4.7, 8.5, 7.1, 6.4, 9.2,
9.8, 5.5, 7.4, 7.0], construa uma função para imprimir apenas as
notas acima de 7 */

var notas = [5.3, 4.7, 8.5, 7.1, 6.4, 9.2, 9.8, 5.5, 7.4, 7.0];

function maiorQueSete(notas) {
    const maiores = notas.filter( nota => nota > 7);
    console.log(maiores);
};

// maiorQueSete(notas);

/* 7.Crie um array de objetos onde cada objeto será um produto de
supermercado e terá o nome do produto e o seu respectivo
preço, agora construa uma função que some todos os valores e
te devolva o total. */

var produtos = [{ nome: "sabão", preco: 6.99 }, { nome: "álcool", preco: 9.99 }, { nome: "café", preco: 12.99 }];

function valorTotal(produtos) {
    const soma = produtos.reduce((total, produto) => total + produto.preco, 0);
    return (soma);
};

// console.log(valorTotal(produtos));

/* 8.Em uma escola ficou definido que os alunos do 8º ano terão
aulas de história e os alunos do 9º terão aulas de física às
quartas-feiras. Você deve criar uma função que receba um
array de objetos contendo nome e série de cada aluno e atribua
a sua respectiva disciplina da quarta-feira. (O array de alunos
deve ser criado como você desejar contanto que contenha pelo
menos 5 alunos). */

var alunos = [{ nome: "Asteach", serie: 9}, 
              { nome: "Dimoroc", serie: 8}, 
              { nome: "Miak", serie: 8}, 
              { nome: "Asirani", serie: 9}, 
              { nome: "Olulian", serie: 9}];

function aulaDeQuarta(alunos) {
    alunos.forEach( aluno => {
        if (aluno.serie == 8) {
            aluno['disciplina'] = "história";
        } else {
            aluno['disciplina'] = "física";
        }
    });
    return alunos;
};

// console.log(aulaDeQuarta(alunos));
