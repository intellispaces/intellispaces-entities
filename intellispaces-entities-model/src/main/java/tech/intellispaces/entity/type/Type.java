package tech.intellispaces.entity.type;

import java.util.List;

/**
 * The abstract class-based type of entity.
 *
 * @param <T> associated type.
 */
public interface Type<T> {

  /**
   * Base class.
   */
  Class<?> baseClass();

  /**
   * Type qualifiers.
   */
  List<Type<?>> qualifierTypes();
}
