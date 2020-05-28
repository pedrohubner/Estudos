package com.semanadois.copy;

public class HQ implements Cloneable{

    private String edicao;
    private int qntdPags;
    private Revista revista;

    public HQ(Revista revista, String edicao, int qntdPags){
        this.revista = revista;
        this.edicao = edicao;
        this.qntdPags = qntdPags;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public int getQntdPags() {
        return qntdPags;
    }

    public void setQntdPags(int qntdPags) {
        this.qntdPags = qntdPags;
    }

    /**
     * Descobrir porque do (HQ) -> Usando um cast para que o clone seja do tipo HQ
     * Descobrir porque do super ->
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        HQ novaHQ = (HQ) super.clone();
        novaHQ.revista = (Revista) revista.clone();
        return novaHQ;
    }

    @Override
    public String toString() {
        return revista + " edição " + edicao + " com " + qntdPags + " páginas.";
    }
}
