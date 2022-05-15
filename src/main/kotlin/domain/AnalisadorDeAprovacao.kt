package domain
import domain.Boletim
import domain.criterios

class AnalisadorDeAprovacao {

    // ---------------------------------
    //
    //      Seu código deve vir aqui
    //
    //      Defina atributos e métodos conforme especificado
    //      no arquivo de teste encontrado em
    //      'src/test/kotlin/domain/AnalisadorDeAprovacaoTest'
    //
    // ---------------------------------
    private var boletimFechado: BoletimFechado
    private var criterio: CriterioDeAprovacao

    fun defineCriterio(crit: CriterioDeAprovacao){
        criterio = crit
    }

    fun fechaBoletim(boletim: Boletim): BoletimFechado{
        boletimFechado.mediaEPs = boletim.mediaEPs
        boletimFechado.mediaMiniEPs = boletim.mediaMiniEPs
        boletimFechado.mediaFinal = criterio.mediaFinal(boletim)
        boletimFechado.foiAprovado = criterio.estaAprovado(boletim)

        return boletimFechado
    }
}