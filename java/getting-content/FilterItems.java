// DocSection: getting_content_filter_items
import com.kenticocloud.delivery;

DeliveryClient client = new DeliveryClient("975bf280-fd91-488c-994c-2f04416e5ee3");

List<NameValuePair> params = DeliveryParameterBuilder.params()
    .filterEquals("system.type", "article")
    .build();

// Create strongly typed models according to https://developer.kenticocloud.com/docs/strongly-typed-models
List<ArticleItem> items = client.getItems(ArticleItem.class);
// EndDocSection