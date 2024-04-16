package Custom3DChart;

import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.ItemLabelAnchor;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.ui.TextAnchor;

import net.sf.jasperreports.engine.JRChart;
import net.sf.jasperreports.engine.JRChartCustomizer;  
/**
*
* @author Chaisak_P
*/
public class CustomChartV1 implements JRChartCustomizer {

	public void customize(JFreeChart chart, JRChart jrChart) {
			
		CategoryPlot plot = (CategoryPlot)chart.getPlot();
		BarRenderer barRenderer = (BarRenderer)plot.getRenderer();
		CategoryPlot categoryPlot = (CategoryPlot) chart.getPlot();
		
		// Display labels on top of bar
		categoryPlot.getRenderer().setBasePositiveItemLabelPosition(new ItemLabelPosition(ItemLabelAnchor.OUTSIDE12, TextAnchor.BOTTOM_CENTER));

		// Spaces label between bars
		barRenderer.setItemLabelAnchorOffset(9.0);
		//Remove spaces between bars
		barRenderer.setItemMargin(0.01);
		//set maximum bar width
		barRenderer.setMaximumBarWidth(0.10);
		
	}

}