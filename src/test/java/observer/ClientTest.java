package observer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClientTest {

    @Test
    public void testNotificacaoCliente() {
        Loja loja = new Loja("Loja A");
        Cliente cliente1 = new Cliente("Cliente 1");
        Cliente cliente2 = new Cliente("Cliente 2");

        cliente1.cadastrar(loja);
        cliente2.cadastrar(loja);

        loja.lançarPromoção();

        assertEquals("Cliente 1, produto em promoção na Loja A", cliente1.getUltimaNotificacao());
        assertEquals("Cliente 2, produto em promoção na Loja A", cliente2.getUltimaNotificacao());
    }

    @Test
    public void testNotificacaoClienteSemPromocao() {
        Loja loja = new Loja("Loja B");
        Cliente cliente = new Cliente("Cliente X");

        cliente.cadastrar(loja);

        assertEquals(null, cliente.getUltimaNotificacao());
    }
}
