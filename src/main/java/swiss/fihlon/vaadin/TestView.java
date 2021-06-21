package swiss.fihlon.vaadin;

import com.vaadin.componentfactory.EnhancedDateTimePicker;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route(value = "")
@PageTitle("Test View")
public class TestView extends Div {

    public TestView() {
        final var dateTimePicker = new EnhancedDateTimePicker("Date & Time");
        add(dateTimePicker);
    }
}
