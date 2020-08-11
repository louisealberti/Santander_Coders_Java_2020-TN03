/**
 * 
 *  Script para a validação, confirmação e envio de um formulário.
 * 
 */

// ------------------------| Variáveis |------------------------------------ //
var form1 = document.getElementById('form1');
var userName = document.getElementById('name');
var lastname = document.getElementById('lastname');
var email = document.getElementById('email');
var password = document.getElementById('password1');
var passwordConfirmation = document.getElementById('password2');
var gender = '';
const genderRadio = document.getElementById('radio');
var genderList = document.querySelectorAll('input[type="radio"]');
var newsletter = assinarNewsletter();
const newsletterCheckbox = document.getElementById('receiveNewsletter');
var innerPage = document.getElementById('innerPage');
var innerContainer = document.createElement('div');
innerContainer.className = "col";
var submitBTN = document.getElementById('submit');
var editBTN = document.getElementById('edit');
var init = false;
var actionList = [];
var data = [];
var regexMail = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,6}$/;
var regexEmpty = /^[a-z0-9]+$/i;
// ------------------------| Usando DeMorgan <3 |--------------------------- //
var regexPassword = /^(.{0,7}|[^0-9]*|[^A-Z]*|[^a-z]*|[a-zA-Z0-9]*)$/;

// ------------------------| Funções |-------------------------------------- //

/**
 *  Submete o formulário para verificação da validade dos dados e confirmação do usuário.
 */
submitBTN.addEventListener("click", () => {
    // ------------------------| Exercício #3a |---------------------------- //
    if (!regexEmpty.test(userName.value)) {
        alert("O campo 'Nome' é obrigatório");
        return;
    }
    if (!regexEmpty.test(lastname.value)) {
        alert("O campo 'Sobrenome' é obrigatório");
        return;
    }
    if (email.value === '') {
        alert("O campo 'e-mail' é obrigatório");
        return;
    } else if (!regexMail.test(email.value)) {
        alert("Formato de e-mail inválido!\nPor favor digite novamente!");
        email.value = '';
        return;
    }
    if (password.value === '') {
        alert("O campo 'Senha' é obrigatório");
        return;
    } else if (regexPassword.test(password.value)) {
        alert("Formato de senha inválido!\nA senha deve ter oito caracteres e pelo menos uma letra maiúscula, uma letra minúscula, um número e um caractere especial.\nPor favor digite novamente!");
        password.value = '';
        return;
    }
    if (passwordConfirmation.value === '') {
        alert("O campo 'Confirmar Senha' é obrigatório");
        return;
    }
    if (!regexEmpty.test(gender)) {
        alert("O campo 'Gênero' é obrigatório");
        return;
    }
    // ------------------------| Exercício #3b  |--------------------------- //
    if (password.value && passwordConfirmation.value && (password.value != passwordConfirmation.value)) {
        alert("As senhas são diferentes!");
        return;
    }

    
    if(init){
        confirmChanges();
    }
    init = true;

    data[0] = userName.value;
    data[1] = lastname.value;
    data[2] = email.value;
    data[3] = password.value;
    data[4] = passwordConfirmation.value;
    data[5] = gender;
    data[6] = newsletter;

    initInnerHTML();
});

/**
*   Exercício #3d: Cria o HTML do formulário preenchido para que o usuário 
*   confirme os dados.
*/
function initInnerHTML() {

    // --------------------| Criar Lista  |--------------------------------- //
    var lista = document.createElement('ul');
    lista.className = "list-group";

    // --------------------| nome |----------------------------------------- //
    var elNome = document.createElement('li');
    elNome.className = "list-group-item";
    elNome.appendChild(document.createTextNode("Nome: " + data[0]));
    lista.appendChild(elNome);

    // --------------------| sobrenome |------------------------------------ //
    var elSobrenome = document.createElement('li');
    elSobrenome.className = "list-group-item";
    elSobrenome.appendChild(document.createTextNode("Sobrenome: " + data[1]));
    lista.appendChild(elSobrenome);

    // --------------------| email |---------------------------------------- //
    var elEmail = document.createElement('li');
    elEmail.className = "list-group-item";
    elEmail.appendChild(document.createTextNode("E-mail: " + data[2]));
    lista.appendChild(elEmail);

    // --------------------| senha |---------------------------------------- //
    var elSenha = document.createElement('li');
    elSenha.className = "list-group-item";
    elSenha.appendChild(document.createTextNode("Senha: " + data[3]));
    lista.appendChild(elSenha);

    // --------------------| genero |--------------------------------------- //
    var elgender = document.createElement('li');
    elgender.className = "list-group-item";
    elgender.appendChild(document.createTextNode("Gênero: " + data[5]));
    lista.appendChild(elgender);

    // --------------------| newsletter |----------------------------------- //
    var elnewsletter = document.createElement('li');
    elnewsletter.className = "list-group-item";
    elnewsletter.appendChild(document.createTextNode("Receber newsletter: " + assinarNewsletter()));
    lista.appendChild(elnewsletter);

    // --------------------| Cria div para colocar os botões |-------------- //
    var btnContainer = document.createElement('div');
    btnContainer.className = "col";
    btnContainer.id = 'div';

    // --------------------| Coloca os botões na lista |-------------------- //
    btnContainer.appendChild(createConfirmBTN());
    btnContainer.appendChild(createEditBTN());
    lista.appendChild(btnContainer);

    // --------------------| Coloca a lista na página |--------------------- //
    innerContainer.appendChild(lista);
    innerPage.appendChild(innerContainer).innerHTML;
    form1.style.display = 'none';
    innerContainer.style.display = 'block';
};

/**
 *  Cria botão para editar as informações na página de confirmação.
 */
function createEditBTN() {
    var editBTN = document.createElement('button');
    editBTN.type = "button";
    editBTN.className = "btn btn-dark float-right m-2";
    editBTN.id = "edit";
    editBTN.addEventListener("click", editForm);
    editBTN.appendChild(document.createTextNode("Editar"));
    return editBTN;
};

/**
 *  Cria botão para enviar as informações ao banco de dados.
 */
function createConfirmBTN() {
    var confirmBTN = document.createElement('button');
    confirmBTN.type = "button";
    confirmBTN.className = "btn btn-dark float-right m-2";
    confirmBTN.id = "confirm";
    confirmBTN.addEventListener("click", envio);
    confirmBTN.appendChild(document.createTextNode("Confirmar"));
    return confirmBTN;
};

/**
 *  Edita as informações preenchidas no formulário.
 */
function editForm() {
    innerContainer.innerHTML = '';
    innerContainer = document.createElement('div');
    innerContainer.className = "col";
    form1.style.display = 'block';
}

/**
 *  Verifica se deseja receber a newsletter.
 */
function assinarNewsletter() { return (document.getElementById('newsletter').checked ? "Sim" : "Não"); };

/**
 *  Exercício #3e: Mudar a cor do background de acordo com a seleção no campo 
 *  gênero.
 */
genderRadio.addEventListener("click", () => {
    for (let i = 0; i < 3; i++) {
        genderList[i].checked ? (gender = genderList[i].value) : 'none';
    }
    if (gender === 'feminino') {
        document.body.style.backgroundColor = '#ff8a80';
    } else if (gender === 'masculino') {
        document.body.style.backgroundColor = '#8c9eff';
    } else if (gender === 'desconhecido') {
        document.body.style.backgroundColor = '#ea80fc';
    }
});

/**
 *  Exercício #3f: confirma as edições feitas pelo usuário.
 */
function confirmChanges() {
    if (data) {
        if (data[0] !== name.value) {
            if (confirm("Quer mesmo mudar o valor do campo 'nome'?")) {
                return;
            } else {
                name.value = data[0];
            }
        }
        if (data[1] !== lastname.value) {
            if (confirm("Quer mesmo mudar o valor do campo 'sobrenome'?")) {
                return;
            } else {
                lastname.value = data[1];
            }
        }
        if (data[2] !== email.value) {
            if (confirm("Quer mesmo mudar o valor do campo 'email'?")) {
                return;
            } else {
                email.value = data[2];
            }
        }
        if (data[3] !== password.value) {
            if (confirm("Quer mesmo mudar o valor do campo 'senha'?")) {
                return;
            } else {
                password.value = data[3];
                passwordConfirmation.value = data[4];
            }
        }
        if (data[5] !== gender.value) {
            if (confirm("Quer mesmo mudar o valor do campo 'genero'?")) {
                return;
            } else {
                gender.value = data[5];
            }
        }
        if (data[6] !== name.value) {
            if (confirm("Quer mesmo mudar o valor do campo 'receber newsletter'?")) {
                return;
            } else {
                newsletter.value = data[6];
            }
        }
    }
};

/**
 *  Exercício #3g: Cria um array com o comportamento do usuário ao preencher o formulário.
 */
// ------------------------| nome |----------------------------------------- //
userName.addEventListener("focus", () => {
    actionList.push("Estabelecer o foco no elemento 'nome'");
    console.log(actionList);
});
userName.addEventListener("change", () => {
    actionList.push("Inserir dados no elemento 'nome'");
    console.log(actionList);
});
userName.addEventListener("blur", () => {
    actionList.push("Perdemos o foco do elemento 'nome'");
    console.log(actionList);
});
// ------------------------| sobrenome |------------------------------------ //
lastname.addEventListener("focus", () => {
    actionList.push("Estabelecer o foco no elemento 'sobrenome'");
    console.log(actionList);
});
lastname.addEventListener("change", () => {
    actionList.push("Inserir dados no elemento 'sobrenome'");
    console.log(actionList);
});
lastname.addEventListener("blur", () => {
    actionList.push("Perdemos o foco do elemento 'sobrenome'");
    console.log(actionList);
});
// ------------------------| email |---------------------------------------- //
email.addEventListener("focus", () => {
    actionList.push("Estabelecer o foco no elemento 'email'");
    console.log(actionList);
});
email.addEventListener("change", () => {
    actionList.push("Inserir dados no elemento 'email'");
    console.log(actionList);
});
email.addEventListener("blur", () => {
    actionList.push("Perdemos o foco do elemento 'email'");
    console.log(actionList);
});
// ------------------------| senha |---------------------------------------- //
password.addEventListener("focus", () => {
    actionList.push("Estabelecer o foco no elemento 'senha'");
    console.log(actionList);
});
password.addEventListener("change", () => {
    actionList.push("Inserir dados no elemento 'senha'");
    console.log(actionList);
});
password.addEventListener("blur", () => {
    actionList.push("Perdemos o foco do elemento 'senha'");
    console.log(actionList);
});
// --------------------| confirmar senha |---------------------------------------- //
passwordConfirmation.addEventListener("focus", () => {
    actionList.push("Estabelecer o foco no elemento 'confirmar senha'");
    console.log(actionList);
});
passwordConfirmation.addEventListener("change", () => {
    actionList.push("Inserir dados no elemento 'confirmar senha'");
    console.log(actionList);
});
passwordConfirmation.addEventListener("blur", () => {
    actionList.push("Perdemos o foco do elemento 'confirmar senha'");
    console.log(actionList);
});
// ------------------------| genero |--------------------------------------- //
genderRadio.addEventListener("click", () => {
    actionList.push("Estabelecer o foco no elemento 'genero'");
    actionList.push("Inserir dados no elemento 'genero'");
    actionList.push("Perdemos o foco do elemento 'genero'");
    console.log(actionList);
});
// ------------------------| newsletter |----------------------------------- //
newsletterCheckbox.addEventListener("click", () => {
    actionList.push("Estabelecer o foco no elemento 'receber newsletter'");
    actionList.push("Inserir dados no elemento 'receber newsletter'");
    actionList.push("Perdemos o foco do elemento 'receber newsletter'");    
    console.log(actionList);
});

/**
 *   Enviar o formulario utilizando AJAX.
 */
function envio() {

    $.ajax({
        method: "POST",
        url: "http://localhost:3000/users",
        data: {
            "name": data[0],
            "lastname": data[1],
            "email": data[2],
            "password": data[3],
            "gender": data[5],
            "newsletter": data[6]
        }
    })

};
