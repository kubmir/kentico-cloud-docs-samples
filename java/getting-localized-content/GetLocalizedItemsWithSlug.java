// DocSection: getting_localized_content_url_slug
import com.kenticocloud.delivery;

DeliveryClient client = new DeliveryClient("975bf280-fd91-488c-994c-2f04416e5ee3");

List<NameValuePair> params = DeliveryParameterBuilder.params()
    .language("es-ES")
    .filterEquals("system.type", "home")
    .filterEquals("elements.url_pattern", "inicio")
    .build();

// Create strongly typed models according to https://developer.kenticocloud.com/docs/strongly-typed-models
List<HomeItem> items = client.getItems(HomeItem.class, params);
// EndDocSection