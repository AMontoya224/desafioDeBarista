public class TestOrders {
    public static void main(String[] args) {
        // Elementos del menú
        Item item1 = new Item( "moka", 4.90 );
        Item item2 = new Item( "latte", 5.50 );
        Item item3 = new Item( "cafe de goteo", 5.90 );
        Item item4 = new Item( "capuchino", 6.25 );

        //Lista de pedidos
        Order pedido1 = new Order();
        Order pedido2 = new Order();
        Order pedido3 = new Order( "Andres" );
        Order pedido4 = new Order( "Luis" );
        Order pedido5 = new Order( "Ana" );

        //Añadir articulos
        pedido1.addArtículo( item1 );
        pedido1.addArtículo( item3 );
        pedido1.addArtículo( item4 );
        pedido1.display();

        pedido2.addArtículo( item1 );
        pedido2.addArtículo( item2 );
        pedido2.display();

        pedido3.addArtículo( item3 );
        pedido3.addArtículo( item1 );
        pedido3.display();

        pedido4.addArtículo( item1 );
        pedido4.addArtículo( item4 );
        pedido4.addArtículo( item4 );
        pedido4.display();

        pedido5.addArtículo( item2 );
        pedido5.addArtículo( item3 );
        pedido5.display();

        //Ver Status
        pedido1.getStatusMessage( true );
        pedido2.getStatusMessage( false );
        pedido3.getStatusMessage( false );
        pedido4.getStatusMessage( true );
        pedido5.getStatusMessage( true );

        //Mostrar precios
        pedido1.getOrderTotal();
        pedido2.getOrderTotal();
        pedido3.getOrderTotal();
        pedido4.getOrderTotal();
        pedido5.getOrderTotal();
    }
}