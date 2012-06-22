package uk.co.certait.htmlexporter.css;

import java.awt.Color;

import junit.framework.Assert;

import org.junit.Test;

public class StyleTest
{
	@Test
	public void testEqualsAndHashCode()
	{
		Style style1 = new Style();
		Style style2 = null;
		
		Assert.assertFalse(style1.equals(style2));
		
		style2 = style1;
		Assert.assertEquals(style1, style2);
		
		style2 = new Style();
		Assert.assertEquals(style1, style2);
		
		style1.addProperty(CssIntegerProperty.FONT_SIZE, 12);
		Assert.assertFalse(style1.equals(style2));
		style2.addProperty(CssIntegerProperty.FONT_SIZE, 11);
		Assert.assertFalse(style1.equals(style2));
		style2.addProperty(CssIntegerProperty.FONT_SIZE, 12);
		Assert.assertEquals(style1, style2);
		Assert.assertEquals(style1.hashCode(), style2.hashCode());
		
		style1.addProperty(CssStringProperty.FONT_WEIGHT, Style.BOLD_FONT_STYLE);
		Assert.assertFalse(style1.equals(style2));
		
		style2.addProperty(CssStringProperty.FONT_WEIGHT, Style.BOLD_FONT_STYLE);
		Assert.assertEquals(style1, style2);
		Assert.assertEquals(style1.hashCode(), style2.hashCode());
		
		style1.addProperty(CssColorProperty.BACKGROUND, Color.GREEN);
		Assert.assertFalse(style1.equals(style2));
		style2.addProperty(CssColorProperty.BACKGROUND, Color.RED);
		Assert.assertFalse(style1.equals(style2));
		style2.addProperty(CssColorProperty.BACKGROUND, Color.GREEN);
		Assert.assertEquals(style1, style2);
		Assert.assertEquals(style1.hashCode(), style2.hashCode());
	}
	
	@Test
	public void testIsFontSizeSet()
	{
		Style style = new Style();
		Assert.assertFalse(style.isFontSizeSet());
		
		style.addProperty(CssIntegerProperty.FONT_SIZE, 12);
		
		Assert.assertTrue(style.isFontSizeSet());
	}
	
	@Test
	public void testIsWidthSet()
	{
		Style style = new Style();
		Assert.assertFalse(style.isWidthSet());
		
		style.addProperty(CssIntegerProperty.WIDTH, 100);
		
		Assert.assertTrue(style.isWidthSet());	
	}
	
	@Test
	public void testIsBorderWidthSet()
	{
		Style style = new Style();
		Assert.assertFalse(style.isBorderWidthSet());
		
		style.addProperty(CssIntegerProperty.BORDER_WIDTH, 2);
		
		Assert.assertTrue(style.isBorderWidthSet());
	}
	
	@Test
	public void testIsFontBold()
	{
		Style style = new Style();
		Assert.assertFalse(style.isFontBold());
		
		style.addProperty(CssStringProperty.FONT_WEIGHT, Style.BOLD_FONT_STYLE);
		
		Assert.assertTrue(style.isFontBold());
	}
	
	@Test
	public void testIsFontItalic()
	{
		Style style = new Style();
		Assert.assertFalse(style.isFontItalic());
		
		style.addProperty(CssStringProperty.FONT_STYLE, Style.ITALIC_FONT_STYLE);
		
		Assert.assertTrue(style.isFontItalic());	
	}
	
	@Test
	public void testIsTextUnderlined()
	{
		Style style = new Style();
		Assert.assertFalse(style.isTextUnderlined());
		
		style.addProperty(CssStringProperty.TEXT_DECORATION, Style.TEXT_DECORATION_UNDERLINE);
		
		Assert.assertTrue(style.isTextUnderlined());	
	}
	
	@Test
	public void testIsLeftAligned()
	{
		Style style = new Style();
		Assert.assertFalse(style.isLeftAligned());
		
		style.addProperty(CssStringProperty.TEXT_ALIGN, Style.LEFT_ALIGN);
		
		Assert.assertTrue(style.isLeftAligned());	
	}
	
	@Test
	public void testIsRightAligned()
	{
		Style style = new Style();
		Assert.assertFalse(style.isRightAligned());
		
		style.addProperty(CssStringProperty.TEXT_ALIGN, Style.RIGHT_ALIGN);
		
		Assert.assertTrue(style.isRightAligned());			
	}
	
	@Test
	public void testIsCenterAligned()
	{
		Style style = new Style();
		Assert.assertFalse(style.isCenterAligned());
		
		style.addProperty(CssStringProperty.TEXT_ALIGN, Style.CENTER_ALIGN);
		
		Assert.assertTrue(style.isCenterAligned());		
	}
	
	@Test
	public void testIsBackgroundSet()
	{
		Style style = new Style();
		Assert.assertFalse(style.isBackgroundSet());
		
		style.addProperty(CssColorProperty.BACKGROUND, Color.RED);
		
		Assert.assertTrue(style.isBackgroundSet());		
	}
	
	@Test
	public void testisColorSet()
	{
		Style style = new Style();
		Assert.assertFalse(style.isColorSet());
		
		style.addProperty(CssColorProperty.COLOR, Color.RED);
		
		Assert.assertTrue(style.isColorSet());		
	}
	
	@Test
	public void testIsBorderColorSet()
	{
		Style style = new Style();
		Assert.assertFalse(style.isBorderColorSet());
		
		style.addProperty(CssColorProperty.BORDER_COLOR, Color.RED);
		
		Assert.assertTrue(style.isBorderColorSet());		
	}
}