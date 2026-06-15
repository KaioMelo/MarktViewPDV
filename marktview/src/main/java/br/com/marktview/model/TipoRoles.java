package br.com.marktview.model;

public enum TipoRoles {
    ROLE_ADMIN("Administrador"),
    ROLE_GERENTE("Gerente"),
    ROLE_OPERADOR("Operador do Caixa");

    private final String descricao;

    // O construtor precisa apenas da descrição amigável para a tela
    TipoRoles(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}