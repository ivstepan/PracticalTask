# DefaultApi

All URIs are relative to *http://localhost:8081*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiAllOrdersGet**](DefaultApi.md#apiAllOrdersGet) | **GET** /api/getAllOrders | Get all orders
[**apiCreateCustomerPost**](DefaultApi.md#apiCreateCustomerPost) | **POST** /api/createCustomer | Create customer
[**apiCreateOrderPost**](DefaultApi.md#apiCreateOrderPost) | **POST** /api/createOrder | Create new order
[**apiCustomerOrdersIdStatusGet**](DefaultApi.md#apiCustomerOrdersIdStatusGet) | **GET** /api/getCustomerOrders/{id}/{status} | Get a customer order
[**apiDeleteOrderIdDelete**](DefaultApi.md#apiDeleteOrderIdDelete) | **DELETE** /api/deleteOrder/{id} | Delete existing order
[**apiUpdateOrderPut**](DefaultApi.md#apiUpdateOrderPut) | **PUT** /api/updateOrder | Update existing order


<a name="apiAllOrdersGet"></a>
# **apiAllOrdersGet**
> List&lt;OrderDTO&gt; apiAllOrdersGet(id, status)

Get all orders

Get all existing orders with customer data, brand and model of the selected vehicle

### Example
```java
// Import classes:
//import ru.mera.carshowroom.rest.ApiException;
//import org.openapitools.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer id = 56; // Integer | Customer id
String status = "status_example"; // String | Status order
try {
    List<OrderDTO> result = apiInstance.apiAllOrdersGet(id, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#apiAllOrdersGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Customer id |
 **status** | **String**| Status order |

### Return type

[**List&lt;OrderDTO&gt;**](OrderDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiCreateCustomerPost"></a>
# **apiCreateCustomerPost**
> ResponseOK apiCreateCustomerPost(customerDTO)

Create customer

Save the first name, last name, email and date of birth of the client

### Example
```java
// Import classes:
//import ru.mera.carshowroom.rest.ApiException;
//import org.openapitools.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
CustomerDTO customerDTO = new CustomerDTO(); // CustomerDTO | 
try {
    ResponseOK result = apiInstance.apiCreateCustomerPost(customerDTO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#apiCreateCustomerPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerDTO** | [**CustomerDTO**](CustomerDTO.md)|  |

### Return type

[**ResponseOK**](ResponseOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiCreateOrderPost"></a>
# **apiCreateOrderPost**
> ResponseOK apiCreateOrderPost(orderDTO)

Create new order

Save selected brand, car model and advanced options

### Example
```java
// Import classes:
//import ru.mera.carshowroom.rest.ApiException;
//import org.openapitools.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
OrderDTO orderDTO = new OrderDTO(); // OrderDTO | 
try {
    ResponseOK result = apiInstance.apiCreateOrderPost(orderDTO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#apiCreateOrderPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderDTO** | [**OrderDTO**](OrderDTO.md)|  |

### Return type

[**ResponseOK**](ResponseOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiCustomerOrdersIdStatusGet"></a>
# **apiCustomerOrdersIdStatusGet**
> List&lt;OrderDTO&gt; apiCustomerOrdersIdStatusGet(id, status)

Get a customer order

Get all orders of the selected client by order status with indication of customer data, brand and model of the selected car

### Example
```java
// Import classes:
//import ru.mera.carshowroom.rest.ApiException;
//import org.openapitools.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer id = 56; // Integer | Customer id
String status = "status_example"; // String | Status order
try {
    List<OrderDTO> result = apiInstance.apiCustomerOrdersIdStatusGet(id, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#apiCustomerOrdersIdStatusGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Customer id |
 **status** | **String**| Status order |

### Return type

[**List&lt;OrderDTO&gt;**](OrderDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiDeleteOrderIdDelete"></a>
# **apiDeleteOrderIdDelete**
> ResponseOK apiDeleteOrderIdDelete(id)

Delete existing order

Delete all transferred order data

### Example
```java
// Import classes:
//import ru.mera.carshowroom.rest.ApiException;
//import org.openapitools.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer id = 56; // Integer | Deleted order id
try {
    ResponseOK result = apiInstance.apiDeleteOrderIdDelete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#apiDeleteOrderIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Deleted order id |

### Return type

[**ResponseOK**](ResponseOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiUpdateOrderPut"></a>
# **apiUpdateOrderPut**
> ResponseOK apiUpdateOrderPut(autoDTO)

Update existing order

Update brand, car model or advanced options

### Example
```java
// Import classes:
//import ru.mera.carshowroom.rest.ApiException;
//import org.openapitools.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
AutoDTO autoDTO = new AutoDTO(); // AutoDTO | 
try {
    ResponseOK result = apiInstance.apiUpdateOrderPut(autoDTO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#apiUpdateOrderPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **autoDTO** | [**AutoDTO**](AutoDTO.md)|  |

### Return type

[**ResponseOK**](ResponseOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

