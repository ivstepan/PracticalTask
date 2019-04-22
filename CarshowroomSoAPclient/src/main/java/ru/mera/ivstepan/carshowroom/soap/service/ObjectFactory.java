
package ru.mera.ivstepan.carshowroom.soap.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.mera.ivstepan.carshowroom.soap.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreateOrder_QNAME = new QName("http://service.soap.carshowroom.ivstepan.mera.ru/", "createOrder");
    private final static QName _DeleteOrderResponse_QNAME = new QName("http://service.soap.carshowroom.ivstepan.mera.ru/", "deleteOrderResponse");
    private final static QName _GetAllOrderElement_QNAME = new QName("http://service.soap.carshowroom.ivstepan.mera.ru/", "GetAllOrderElement");
    private final static QName _GetCustomerOrdersResponse_QNAME = new QName("http://service.soap.carshowroom.ivstepan.mera.ru/", "getCustomerOrdersResponse");
    private final static QName _CreateCustomer_QNAME = new QName("http://service.soap.carshowroom.ivstepan.mera.ru/", "createCustomer");
    private final static QName _UpdateOrderResponse_QNAME = new QName("http://service.soap.carshowroom.ivstepan.mera.ru/", "updateOrderResponse");
    private final static QName _CreateOrderResponse_QNAME = new QName("http://service.soap.carshowroom.ivstepan.mera.ru/", "createOrderResponse");
    private final static QName _CreateCustomerResponse_QNAME = new QName("http://service.soap.carshowroom.ivstepan.mera.ru/", "createCustomerResponse");
    private final static QName _GetAllOrdersResponse_QNAME = new QName("http://service.soap.carshowroom.ivstepan.mera.ru/", "getAllOrdersResponse");
    private final static QName _CustomerElement_QNAME = new QName("http://service.soap.carshowroom.ivstepan.mera.ru/", "CustomerElement");
    private final static QName _UpdateOrder_QNAME = new QName("http://service.soap.carshowroom.ivstepan.mera.ru/", "updateOrder");
    private final static QName _GetAllOrders_QNAME = new QName("http://service.soap.carshowroom.ivstepan.mera.ru/", "getAllOrders");
    private final static QName _GetCustomerOrders_QNAME = new QName("http://service.soap.carshowroom.ivstepan.mera.ru/", "getCustomerOrders");
    private final static QName _SaveCustomerElement_QNAME = new QName("http://service.soap.carshowroom.ivstepan.mera.ru/", "SaveCustomerElement");
    private final static QName _OrderElement_QNAME = new QName("http://service.soap.carshowroom.ivstepan.mera.ru/", "OrderElement");
    private final static QName _AutoOptionsElement_QNAME = new QName("http://service.soap.carshowroom.ivstepan.mera.ru/", "AutoOptionsElement");
    private final static QName _GetOrderRequestElement_QNAME = new QName("http://service.soap.carshowroom.ivstepan.mera.ru/", "GetOrderRequestElement");
    private final static QName _GetOrderResponseElement_QNAME = new QName("http://service.soap.carshowroom.ivstepan.mera.ru/", "GetOrderResponseElement");
    private final static QName _UpdateOrderElement_QNAME = new QName("http://service.soap.carshowroom.ivstepan.mera.ru/", "UpdateOrderElement");
    private final static QName _DeleteOrder_QNAME = new QName("http://service.soap.carshowroom.ivstepan.mera.ru/", "deleteOrder");
    private final static QName _SaveOrderElement_QNAME = new QName("http://service.soap.carshowroom.ivstepan.mera.ru/", "SaveOrderElement");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.mera.ivstepan.carshowroom.soap.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateOrder }
     * 
     */
    public CreateOrder createCreateOrder() {
        return new CreateOrder();
    }

    /**
     * Create an instance of {@link DeleteOrderResponse }
     * 
     */
    public DeleteOrderResponse createDeleteOrderResponse() {
        return new DeleteOrderResponse();
    }

    /**
     * Create an instance of {@link GetAllOrderElement }
     * 
     */
    public GetAllOrderElement createGetAllOrderElement() {
        return new GetAllOrderElement();
    }

    /**
     * Create an instance of {@link GetCustomerOrdersResponse }
     * 
     */
    public GetCustomerOrdersResponse createGetCustomerOrdersResponse() {
        return new GetCustomerOrdersResponse();
    }

    /**
     * Create an instance of {@link CreateCustomer }
     * 
     */
    public CreateCustomer createCreateCustomer() {
        return new CreateCustomer();
    }

    /**
     * Create an instance of {@link UpdateOrderResponse }
     * 
     */
    public UpdateOrderResponse createUpdateOrderResponse() {
        return new UpdateOrderResponse();
    }

    /**
     * Create an instance of {@link CreateOrderResponse }
     * 
     */
    public CreateOrderResponse createCreateOrderResponse() {
        return new CreateOrderResponse();
    }

    /**
     * Create an instance of {@link CreateCustomerResponse }
     * 
     */
    public CreateCustomerResponse createCreateCustomerResponse() {
        return new CreateCustomerResponse();
    }

    /**
     * Create an instance of {@link GetAllOrdersResponse }
     * 
     */
    public GetAllOrdersResponse createGetAllOrdersResponse() {
        return new GetAllOrdersResponse();
    }

    /**
     * Create an instance of {@link CustomerElement }
     * 
     */
    public CustomerElement createCustomerElement() {
        return new CustomerElement();
    }

    /**
     * Create an instance of {@link UpdateOrder }
     * 
     */
    public UpdateOrder createUpdateOrder() {
        return new UpdateOrder();
    }

    /**
     * Create an instance of {@link GetAllOrders }
     * 
     */
    public GetAllOrders createGetAllOrders() {
        return new GetAllOrders();
    }

    /**
     * Create an instance of {@link GetCustomerOrders }
     * 
     */
    public GetCustomerOrders createGetCustomerOrders() {
        return new GetCustomerOrders();
    }

    /**
     * Create an instance of {@link SaveCustomerElement }
     * 
     */
    public SaveCustomerElement createSaveCustomerElement() {
        return new SaveCustomerElement();
    }

    /**
     * Create an instance of {@link OrderElement }
     * 
     */
    public OrderElement createOrderElement() {
        return new OrderElement();
    }

    /**
     * Create an instance of {@link AutoOptionsElement }
     * 
     */
    public AutoOptionsElement createAutoOptionsElement() {
        return new AutoOptionsElement();
    }

    /**
     * Create an instance of {@link GetOrderRequestElement }
     * 
     */
    public GetOrderRequestElement createGetOrderRequestElement() {
        return new GetOrderRequestElement();
    }

    /**
     * Create an instance of {@link GetOrderResponseElement }
     * 
     */
    public GetOrderResponseElement createGetOrderResponseElement() {
        return new GetOrderResponseElement();
    }

    /**
     * Create an instance of {@link DeleteOrder }
     * 
     */
    public DeleteOrder createDeleteOrder() {
        return new DeleteOrder();
    }

    /**
     * Create an instance of {@link SaveOrderElement }
     * 
     */
    public SaveOrderElement createSaveOrderElement() {
        return new SaveOrderElement();
    }

    /**
     * Create an instance of {@link DeleteOrderElement }
     * 
     */
    public DeleteOrderElement createDeleteOrderElement() {
        return new DeleteOrderElement();
    }

    /**
     * Create an instance of {@link UpdateOrderElement }
     * 
     */
    public UpdateOrderElement createUpdateOrderElement() {
        return new UpdateOrderElement();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.carshowroom.ivstepan.mera.ru/", name = "createOrder")
    public JAXBElement<CreateOrder> createCreateOrder(CreateOrder value) {
        return new JAXBElement<CreateOrder>(_CreateOrder_QNAME, CreateOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.carshowroom.ivstepan.mera.ru/", name = "deleteOrderResponse")
    public JAXBElement<DeleteOrderResponse> createDeleteOrderResponse(DeleteOrderResponse value) {
        return new JAXBElement<DeleteOrderResponse>(_DeleteOrderResponse_QNAME, DeleteOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllOrderElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.carshowroom.ivstepan.mera.ru/", name = "GetAllOrderElement")
    public JAXBElement<GetAllOrderElement> createGetAllOrderElement(GetAllOrderElement value) {
        return new JAXBElement<GetAllOrderElement>(_GetAllOrderElement_QNAME, GetAllOrderElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerOrdersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.carshowroom.ivstepan.mera.ru/", name = "getCustomerOrdersResponse")
    public JAXBElement<GetCustomerOrdersResponse> createGetCustomerOrdersResponse(GetCustomerOrdersResponse value) {
        return new JAXBElement<GetCustomerOrdersResponse>(_GetCustomerOrdersResponse_QNAME, GetCustomerOrdersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.carshowroom.ivstepan.mera.ru/", name = "createCustomer")
    public JAXBElement<CreateCustomer> createCreateCustomer(CreateCustomer value) {
        return new JAXBElement<CreateCustomer>(_CreateCustomer_QNAME, CreateCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.carshowroom.ivstepan.mera.ru/", name = "updateOrderResponse")
    public JAXBElement<UpdateOrderResponse> createUpdateOrderResponse(UpdateOrderResponse value) {
        return new JAXBElement<UpdateOrderResponse>(_UpdateOrderResponse_QNAME, UpdateOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.carshowroom.ivstepan.mera.ru/", name = "createOrderResponse")
    public JAXBElement<CreateOrderResponse> createCreateOrderResponse(CreateOrderResponse value) {
        return new JAXBElement<CreateOrderResponse>(_CreateOrderResponse_QNAME, CreateOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.carshowroom.ivstepan.mera.ru/", name = "createCustomerResponse")
    public JAXBElement<CreateCustomerResponse> createCreateCustomerResponse(CreateCustomerResponse value) {
        return new JAXBElement<CreateCustomerResponse>(_CreateCustomerResponse_QNAME, CreateCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllOrdersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.carshowroom.ivstepan.mera.ru/", name = "getAllOrdersResponse")
    public JAXBElement<GetAllOrdersResponse> createGetAllOrdersResponse(GetAllOrdersResponse value) {
        return new JAXBElement<GetAllOrdersResponse>(_GetAllOrdersResponse_QNAME, GetAllOrdersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.carshowroom.ivstepan.mera.ru/", name = "CustomerElement")
    public JAXBElement<CustomerElement> createCustomerElement(CustomerElement value) {
        return new JAXBElement<CustomerElement>(_CustomerElement_QNAME, CustomerElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.carshowroom.ivstepan.mera.ru/", name = "updateOrder")
    public JAXBElement<UpdateOrder> createUpdateOrder(UpdateOrder value) {
        return new JAXBElement<UpdateOrder>(_UpdateOrder_QNAME, UpdateOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllOrders }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.carshowroom.ivstepan.mera.ru/", name = "getAllOrders")
    public JAXBElement<GetAllOrders> createGetAllOrders(GetAllOrders value) {
        return new JAXBElement<GetAllOrders>(_GetAllOrders_QNAME, GetAllOrders.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerOrders }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.carshowroom.ivstepan.mera.ru/", name = "getCustomerOrders")
    public JAXBElement<GetCustomerOrders> createGetCustomerOrders(GetCustomerOrders value) {
        return new JAXBElement<GetCustomerOrders>(_GetCustomerOrders_QNAME, GetCustomerOrders.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveCustomerElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.carshowroom.ivstepan.mera.ru/", name = "SaveCustomerElement")
    public JAXBElement<SaveCustomerElement> createSaveCustomerElement(SaveCustomerElement value) {
        return new JAXBElement<SaveCustomerElement>(_SaveCustomerElement_QNAME, SaveCustomerElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.carshowroom.ivstepan.mera.ru/", name = "OrderElement")
    public JAXBElement<OrderElement> createOrderElement(OrderElement value) {
        return new JAXBElement<OrderElement>(_OrderElement_QNAME, OrderElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutoOptionsElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.carshowroom.ivstepan.mera.ru/", name = "AutoOptionsElement")
    public JAXBElement<AutoOptionsElement> createAutoOptionsElement(AutoOptionsElement value) {
        return new JAXBElement<AutoOptionsElement>(_AutoOptionsElement_QNAME, AutoOptionsElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrderRequestElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.carshowroom.ivstepan.mera.ru/", name = "GetOrderRequestElement")
    public JAXBElement<GetOrderRequestElement> createGetOrderRequestElement(GetOrderRequestElement value) {
        return new JAXBElement<GetOrderRequestElement>(_GetOrderRequestElement_QNAME, GetOrderRequestElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrderResponseElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.carshowroom.ivstepan.mera.ru/", name = "GetOrderResponseElement")
    public JAXBElement<GetOrderResponseElement> createGetOrderResponseElement(GetOrderResponseElement value) {
        return new JAXBElement<GetOrderResponseElement>(_GetOrderResponseElement_QNAME, GetOrderResponseElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.carshowroom.ivstepan.mera.ru/", name = "UpdateOrderElement")
    public JAXBElement<Object> createUpdateOrderElement(Object value) {
        return new JAXBElement<Object>(_UpdateOrderElement_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.carshowroom.ivstepan.mera.ru/", name = "deleteOrder")
    public JAXBElement<DeleteOrder> createDeleteOrder(DeleteOrder value) {
        return new JAXBElement<DeleteOrder>(_DeleteOrder_QNAME, DeleteOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveOrderElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.carshowroom.ivstepan.mera.ru/", name = "SaveOrderElement")
    public JAXBElement<SaveOrderElement> createSaveOrderElement(SaveOrderElement value) {
        return new JAXBElement<SaveOrderElement>(_SaveOrderElement_QNAME, SaveOrderElement.class, null, value);
    }

}
