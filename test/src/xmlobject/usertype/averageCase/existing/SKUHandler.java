package xmlobject.usertype.averageCase.existing;

import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlValueOutOfRangeException;

public class SKUHandler
{

    public static void encodeSKU(SKU obj, SimpleValue target)
    {
        String digits;
        if (obj.getDigits() < 10)
            digits = "00" + Integer.toString(obj.getDigits());
        else if (obj.getDigits() < 100)
            digits = "0" + Integer.toString(obj.getDigits());
        else
            digits = Integer.toString(obj.getDigits());
        target.setStringValue(digits + "-" + obj.getLetters());
    }

    public static SKU decodeSKU(SimpleValue obj) throws XmlValueOutOfRangeException
    {
        String encoded = obj.getStringValue();
        if (encoded.length() != 6)
            throw new XmlValueOutOfRangeException("Invalid SKU format: " + encoded);

        SKU sku = new SKU();
        try
        {
            sku.setDigits(Integer.parseInt(encoded.substring(0,3)));
        } catch (NumberFormatException e) {
            throw new XmlValueOutOfRangeException("Invalid SKU format: " + encoded);
        } catch (IllegalArgumentException e) {
            throw new XmlValueOutOfRangeException("Invalid SKU format: " + encoded);
        }

        sku.setLetters(encoded.substring(4,6));
        return sku;
    }
}
