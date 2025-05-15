function novoAluno(nome, idade, descricao, aspiracao){
    this.nome = nome;
    this.idade = idade;
    this.descricao = descricao;
    this.aspiracao = aspiracao;
    this.ficha = function(){
        return this.nome + ", "+ this.idade
    }
    this.apresentar = function(){
        return this.descricao + "\n Aspiração: " + this.aspiracao
    }
}

var paragrafos = document.getElementsByTagName("p")
var titulos = document.getElementsByName("titleA")

let pessoas = [
    new novoAluno("Skrillex", 17, "Sou mega super genial e ovo música!", "A Complexa Existência do Existir"),
    new novoAluno("Ava", 18, "Meu nome se dá pelo Arthur Valezio Alves. Sou molier.", "homens ruivos"),
    new novoAluno("Thaindia", 61, "Estou em dúvidas entre amazona, índia e negra. Me ajude a decidir!", "Espelhos e armas de fogo."),
    new novoAluno("Simões", 16, "Serei tudo, em vários lugares, e talvez ao mesmo tempo.", "Life in a Dreamhouse"), 
    new novoAluno("Eufrásia Kelly", 19, "Faço unhas em casa, leio Jung por hobby e traduzo treta de gringa no X.", "Ter meu próprio talk show no Kwai."),
    new novoAluno("Romarildo Neto", 23, "Filósofo de rodoviária, designer por acidente. Vivo entre o Figma e o churrasco do tio Zé.", "Fazer um TEDx na laje."),
    new novoAluno("Cleidismar", 21, "Coach de relacionamentos que nunca deram certo.", "Publicar um livro de autoajuda em formato de thread."),
    new novoAluno("Tamires Rayanne", 24, "Modelo, atriz, influencer e gamer, dependendo do dia e da maré.", "Ser capa da Capricho que não existe mais."),
    new novoAluno("Gelcivan", 20, "Streamer de emulador de PS2 e evangelizador de ASMR de quebrada.", "Montar uma lan house temática com funk nostálgico."),
    new novoAluno("Josicléia Vitória", 22, "Ex-aluna do EAD da vida, atual fada sensata do Insta.", "Criar uma linha de roupas baseadas nos signos e no Brega."),
    new novoAluno("Marcondes Lúcio", 27, "Cantor de pagotrap, já fui meme duas vezes e só chorei em uma.", "Compor uma música só com ditados da minha avó."),
    new novoAluno("Adalgisa Cristal", 30, "Guru digital, taróloga dos famosos e espiritual coach de casal em crise.", "Virar trend com previsão de apocalipse que não acontece."),
    new novoAluno("Uanderson", 18, "Tiktoker de dancinha e microinfluencer da Vila Catinga.", "Aparecer no Domingo Legal fugindo de uma pegadinha."),
    new novoAluno("Quitéria Laís", 25, "Cursei Direito por dois semestres, mas minha vocação é ser vilã de novela.", "Ser jurada em um reality show de barraco."),
    new novoAluno("Jailson Romeu", 19, "Compositor de rimas existenciais e ex-ADM de página gospel.", "Fundar uma igreja em homenagem à Nuvem de Tags."),
    new novoAluno("Rosenilda", 35, "Vendo açaí e lanço curses nos haters pelo Zap.", "Participar do BBB só pra tretar com o Boninho."),
    new novoAluno("Maikevison", 17, "Cria da Baixada. Já viralizei imitando o Faustão e a Peppa ao mesmo tempo.", "Ser dublador de desenho animado do SBT."),
    new novoAluno("Elizângela Luz", 26, "Influencer da estética gospel dark academia.", "Criar uma bíblia comentada com tweets e memes."),
    new novoAluno("Kleberth", 22, "Webnamoro com uma IA e admin do grupo 'Memes da Depressão Culta'.", "Casar num casamento temático de Matrix."),
    new novoAluno("Juscicleide", 33, "Treteira profissional do grupo da família, só falo com gif do Silvio Santos.", "Escrever a autobiografia 'Nasci pra lacrar'."),
    new novoAluno("Roberval Henrique", 24, "Poeta marginal, vendedor de brigadeiro e consultor de moda alternativa.", "Fazer um curta-metragem só com filtro do Instagram."),
    new novoAluno("Neide Lorrayne", 28, "Sou beauty artist, crio make com temas de novela e treta histórica brasileira.", "Ser maquiadora oficial da próxima CPI."),
    new novoAluno("Wescley Jonatas", 21, "Fiz ENEM só pra tirar print. Hoje sou místico de app de namoro.", "Aparecer em todos os signos do horóscopo ao mesmo tempo."),
    new novoAluno("Edivanilda", 39, "Sou mãe solteira, motorista de app e viciada em fazer exposed de cliente escroto.", "Viralizar ensinando a criar DR por voz no WhatsApp."),
    new novoAluno("Danilto", 20, "Criei um canal no YouTube ensinando como desaparecer socialmente com estilo.", "Lançar um curso de desapego emocional via slides."),
    new novoAluno("Cristhyam", 19, "Gosto de criar teorias da conspiração envolvendo ex-BBBs e presidentes antigos.", "Ser colunista paranormal do Jornal Nacional."),
    new novoAluno("Valkíria Jhenifer", 23, "Fui líder de torcida, agora sou narradora de fanfic interativa no TikTok.", "Dirigir uma novela feita 100% por IA."),
    new novoAluno("Leurismar", 31, "Entusiasta de memes regionais, organizador do Encontro Nacional dos Admiradores do Lampião 3D.", "Criar um app de vaquejada com realidade aumentada."),
    new novoAluno("Odilene França", 40, "Ex-candidata a vereadora, hoje guru dos cristais na Feira de São Cristóvão.", "Conquistar o mundo vendendo banho energético em lata."),
    new novoAluno("Mailson", 27, "Trabalho com TI e memes proféticos desde os tempos do Orkut.", "Hackear a mente coletiva com um meme transcendental."),
    new novoAluno("Cleuson Carlos", 22, "Estudante de Letras, ex-vlogueiro do Vine e fã de novelas mexicanas dubladas.", "Criar um dicionário da internet BR desde 2004."),
    new novoAluno("Zoraide Luzia", 38, "Sou artista plástica autodidata com base em papel de pão e histórias de terreiro.", "Fazer uma instalação no MASP usando tweets e farinha."),
    new novoAluno("Nayrla Thaynara", 25, "Criei minha própria religião baseada em emojis e previsões do Google Tradutor.", "Participar do Encontro com Fátima mesmo sem ela estar lá."),
    new novoAluno("Benedito Yure", 29, "Faço cosplay de políticos no TikTok e declamo slam em rodoviária.", "Criar uma peça de teatro em que todos os personagens são eu mesmo."),


]

let index = 0

const proxpag1 = document.getElementById("Linkn1")
proxpag1.onclick =() => window.location.href = "atv0905.html"


const button = document.getElementsByTagName("button")
button[0].onclick = function(){
    console.log(paragrafos);
    console.log(titulos);
    for(const paragrafo of paragrafos){
        paragrafo.textContent = pessoas[index].apresentar()
    }
    for(const titulo of titulos){
        titulo.textContent = pessoas[index].ficha()
    }
    index = (index + 1) % 34
}