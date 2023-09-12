package projeto_iphone2007.NavegadorDeInternet;

public class SafariMobile {
    private Navegador abaAtual;

    public SafariMobile() {
        abaAtual = new Navegador("Google", "https://www.google.com");
    }

    public void acessarURL(String url) {
        if (abaAtual == null) {
            abaAtual = new Navegador("Nova aba", url);
        } else {
            abaAtual.setUrl(url);
        }
        System.out.println("Acessando URL: " + url);
    }

    public void abrirNovaAba(String url) {
        abaAtual = new Navegador("Nova aba", url);
        System.out.println("Nova aba aberta com a URL: " + url);
    }

    public void atualizarPagina() {
        if (abaAtual != null) {
            String urlAtual = abaAtual.getUrl();
            System.out.println("Atualizando página: " + urlAtual);
        } else {
            System.out.println("Nenhuma aba aberta para atualizar.");
        }
    }

    public void exibirAbaAtual() {
        if (abaAtual != null) {
            System.out.println("Aba atual: " + abaAtual.getPagina());
            System.out.println("URL atual: " + abaAtual.getUrl());
        } else {
            System.out.println("Nenhuma aba aberta.");
        }
    }
}
