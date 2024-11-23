package tech.intellispaces.entity.type;

import org.junit.jupiter.api.Test;
import tech.intellispaces.entity.exception.UnexpectedException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

/**
 * Tests for {@link PrimitiveTypes} class.
 */
public class PrimitiveTypesTest {

  @Test
  public void testGet() {
    assertThat(PrimitiveTypes.get("boolean")).isSameAs(PrimitiveTypes.Boolean);
    assertThat(PrimitiveTypes.get("char")).isSameAs(PrimitiveTypes.Char);
    assertThat(PrimitiveTypes.get("byte")).isSameAs(PrimitiveTypes.Byte);
    assertThat(PrimitiveTypes.get("short")).isSameAs(PrimitiveTypes.Short);
    assertThat(PrimitiveTypes.get("int")).isSameAs(PrimitiveTypes.Int);
    assertThat(PrimitiveTypes.get("long")).isSameAs(PrimitiveTypes.Long);
    assertThat(PrimitiveTypes.get("float")).isSameAs(PrimitiveTypes.Float);
    assertThat(PrimitiveTypes.get("double")).isSameAs(PrimitiveTypes.Double);

    assertThatThrownBy(() -> PrimitiveTypes.get("String"))
        .isExactlyInstanceOf(UnexpectedException.class)
        .hasMessage("Not primitive typename: String");
  }

  @Test
  public void testIsBoolean() {
    assertThat(PrimitiveTypes.Boolean.isBoolean()).isTrue();
    assertThat(PrimitiveTypes.Char.isBoolean()).isFalse();
    assertThat(PrimitiveTypes.Byte.isBoolean()).isFalse();
    assertThat(PrimitiveTypes.Short.isBoolean()).isFalse();
    assertThat(PrimitiveTypes.Int.isBoolean()).isFalse();
    assertThat(PrimitiveTypes.Long.isBoolean()).isFalse();
    assertThat(PrimitiveTypes.Float.isBoolean()).isFalse();
    assertThat(PrimitiveTypes.Double.isBoolean()).isFalse();
  }

  @Test
  public void testIsChar() {
    assertThat(PrimitiveTypes.Boolean.isChar()).isFalse();
    assertThat(PrimitiveTypes.Char.isChar()).isTrue();
    assertThat(PrimitiveTypes.Byte.isChar()).isFalse();
    assertThat(PrimitiveTypes.Short.isChar()).isFalse();
    assertThat(PrimitiveTypes.Int.isChar()).isFalse();
    assertThat(PrimitiveTypes.Long.isChar()).isFalse();
    assertThat(PrimitiveTypes.Float.isChar()).isFalse();
    assertThat(PrimitiveTypes.Double.isChar()).isFalse();
  }

  @Test
  public void testIsByte() {
    assertThat(PrimitiveTypes.Boolean.isByte()).isFalse();
    assertThat(PrimitiveTypes.Char.isByte()).isFalse();
    assertThat(PrimitiveTypes.Byte.isByte()).isTrue();
    assertThat(PrimitiveTypes.Short.isByte()).isFalse();
    assertThat(PrimitiveTypes.Int.isByte()).isFalse();
    assertThat(PrimitiveTypes.Long.isByte()).isFalse();
    assertThat(PrimitiveTypes.Float.isByte()).isFalse();
    assertThat(PrimitiveTypes.Double.isByte()).isFalse();
  }

  @Test
  public void testIsShort() {
    assertThat(PrimitiveTypes.Boolean.isShort()).isFalse();
    assertThat(PrimitiveTypes.Char.isShort()).isFalse();
    assertThat(PrimitiveTypes.Byte.isShort()).isFalse();
    assertThat(PrimitiveTypes.Short.isShort()).isTrue();
    assertThat(PrimitiveTypes.Int.isShort()).isFalse();
    assertThat(PrimitiveTypes.Long.isShort()).isFalse();
    assertThat(PrimitiveTypes.Float.isShort()).isFalse();
    assertThat(PrimitiveTypes.Double.isShort()).isFalse();
  }

  @Test
  public void testIsInt() {
    assertThat(PrimitiveTypes.Boolean.isInt()).isFalse();
    assertThat(PrimitiveTypes.Char.isInt()).isFalse();
    assertThat(PrimitiveTypes.Byte.isInt()).isFalse();
    assertThat(PrimitiveTypes.Short.isInt()).isFalse();
    assertThat(PrimitiveTypes.Int.isInt()).isTrue();
    assertThat(PrimitiveTypes.Long.isInt()).isFalse();
    assertThat(PrimitiveTypes.Float.isInt()).isFalse();
    assertThat(PrimitiveTypes.Double.isInt()).isFalse();
  }

  @Test
  public void testIsLong() {
    assertThat(PrimitiveTypes.Boolean.isLong()).isFalse();
    assertThat(PrimitiveTypes.Char.isLong()).isFalse();
    assertThat(PrimitiveTypes.Byte.isLong()).isFalse();
    assertThat(PrimitiveTypes.Short.isLong()).isFalse();
    assertThat(PrimitiveTypes.Int.isLong()).isFalse();
    assertThat(PrimitiveTypes.Long.isLong()).isTrue();
    assertThat(PrimitiveTypes.Float.isLong()).isFalse();
    assertThat(PrimitiveTypes.Double.isLong()).isFalse();
  }

  @Test
  public void testIsFloat() {
    assertThat(PrimitiveTypes.Boolean.isFloat()).isFalse();
    assertThat(PrimitiveTypes.Char.isFloat()).isFalse();
    assertThat(PrimitiveTypes.Byte.isFloat()).isFalse();
    assertThat(PrimitiveTypes.Short.isFloat()).isFalse();
    assertThat(PrimitiveTypes.Int.isFloat()).isFalse();
    assertThat(PrimitiveTypes.Long.isFloat()).isFalse();
    assertThat(PrimitiveTypes.Float.isFloat()).isTrue();
    assertThat(PrimitiveTypes.Double.isFloat()).isFalse();
  }

  @Test
  public void testIsDouble() {
    assertThat(PrimitiveTypes.Boolean.isDouble()).isFalse();
    assertThat(PrimitiveTypes.Char.isDouble()).isFalse();
    assertThat(PrimitiveTypes.Byte.isDouble()).isFalse();
    assertThat(PrimitiveTypes.Short.isDouble()).isFalse();
    assertThat(PrimitiveTypes.Int.isDouble()).isFalse();
    assertThat(PrimitiveTypes.Long.isDouble()).isFalse();
    assertThat(PrimitiveTypes.Float.isDouble()).isFalse();
    assertThat(PrimitiveTypes.Double.isDouble()).isTrue();
  }

  @Test
  public void testTypename() {
    assertThat(PrimitiveTypes.Boolean.typename()).isEqualTo("boolean");
    assertThat(PrimitiveTypes.Char.typename()).isEqualTo("char");
    assertThat(PrimitiveTypes.Byte.typename()).isEqualTo("byte");
    assertThat(PrimitiveTypes.Short.typename()).isEqualTo("short");
    assertThat(PrimitiveTypes.Int.typename()).isEqualTo("int");
    assertThat(PrimitiveTypes.Long.typename()).isEqualTo("long");
    assertThat(PrimitiveTypes.Float.typename()).isEqualTo("float");
    assertThat(PrimitiveTypes.Double.typename()).isEqualTo("double");
  }

  @Test
  public void testWrapperClass() {
    assertThat(PrimitiveTypes.Boolean.wrapperClass()).isSameAs(Boolean.class);
    assertThat(PrimitiveTypes.Char.wrapperClass()).isSameAs(Character.class);
    assertThat(PrimitiveTypes.Byte.wrapperClass()).isSameAs(Byte.class);
    assertThat(PrimitiveTypes.Short.wrapperClass()).isSameAs(Short.class);
    assertThat(PrimitiveTypes.Int.wrapperClass()).isSameAs(Integer.class);
    assertThat(PrimitiveTypes.Long.wrapperClass()).isSameAs(Long.class);
    assertThat(PrimitiveTypes.Float.wrapperClass()).isSameAs(Float.class);
    assertThat(PrimitiveTypes.Double.wrapperClass()).isSameAs(Double.class);
  }

  @Test
  public void testBaseClass() {
    assertThat(PrimitiveTypes.Boolean.baseClass()).isSameAs(boolean.class);
    assertThat(PrimitiveTypes.Char.baseClass()).isSameAs(char.class);
    assertThat(PrimitiveTypes.Byte.baseClass()).isSameAs(byte.class);
    assertThat(PrimitiveTypes.Short.baseClass()).isSameAs(short.class);
    assertThat(PrimitiveTypes.Int.baseClass()).isSameAs(int.class);
    assertThat(PrimitiveTypes.Long.baseClass()).isSameAs(long.class);
    assertThat(PrimitiveTypes.Float.baseClass()).isSameAs(float.class);
    assertThat(PrimitiveTypes.Double.baseClass()).isSameAs(double.class);
  }

  @Test
  public void testQualifierTypes() {
    assertThat(PrimitiveTypes.Boolean.qualifierTypes()).isEmpty();
    assertThat(PrimitiveTypes.Char.qualifierTypes()).isEmpty();
    assertThat(PrimitiveTypes.Byte.qualifierTypes()).isEmpty();
    assertThat(PrimitiveTypes.Short.qualifierTypes()).isEmpty();
    assertThat(PrimitiveTypes.Int.qualifierTypes()).isEmpty();
    assertThat(PrimitiveTypes.Long.qualifierTypes()).isEmpty();
    assertThat(PrimitiveTypes.Float.qualifierTypes()).isEmpty();
    assertThat(PrimitiveTypes.Double.qualifierTypes()).isEmpty();
  }
}