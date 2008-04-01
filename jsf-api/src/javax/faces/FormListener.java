package javax.faces;

import java.util.EventListener;

/**
 * The listener interface for handling form events.
 * An object should implement this interface if it needs
 * to respond to lifecycle events on a WForm component.
 *
 * @see WForm#addFormListener
 */
public interface FormListener extends EventListener {
    /**
     * Invoked when a form INIT event occurs.
     * @param event the FormEvent object describing the form event
     */
    public void formInit(FormEvent event);

    /**
     * Invoked when a form CONTROL_ADDED event occurs.
     * @param event the FormEvent object describing the form event
     */
    public void formControlAdded(FormEvent event);

    /**
     * Invoked when a form CONTROL_REMOVED event occurs.
     * @param event the FormEvent object describing the form event
     */
    public void formControlRemoved(FormEvent event);

   /**
     * Invoked when a form CONTROL_EXITED event occurs.
     * @param event the FormEvent object describing the form event
     */
    public void formExited(FormEvent event);


}
