package org.example;

/**
 * Represents an EDI (Electronic Data Interchange) message.
 * This class encapsulates the sender, receiver, and content of a message.
 *
 * It provides:
 * 1. Private fields for encapsulation.
 * 2. Constructors for easy object creation.
 * 3. Getters and setters for controlled access to fields.
 * 4. A toString() method for human-readable representation.
 */
public class EDIMessage {

    // Private fields for the message attributes (Encapsulation principle)
    private String sender;   // The sender of the message
    private String receiver; // The recipient of the message
    private String content;  // The content or body of the message

    /**
     * Default constructor.
     * Required for frameworks like Jackson when deserializing JSON into objects.
     */
    public EDIMessage() {
        // Empty constructor for frameworks and libraries
    }

    /**
     * Parameterized constructor.
     * Allows quick creation of an EDIMessage object with specific values.
     *
     * @param sender   The sender of the message.
     * @param receiver The receiver of the message.
     * @param content  The content of the message.
     */
    public EDIMessage(String sender, String receiver, String content) {
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
    }

    /**
     * Gets the sender of the message.
     *
     * @return The sender's name or identifier.
     */
    public String getSender() {
        return sender;
    }

    /**
     * Sets the sender of the message.
     *
     * @param sender The sender's name or identifier.
     */
    public void setSender(String sender) {
        this.sender = sender;
    }

    /**
     * Gets the receiver of the message.
     *
     * @return The receiver's name or identifier.
     */
    public String getReceiver() {
        return receiver;
    }

    /**
     * Sets the receiver of the message.
     *
     * @param receiver The receiver's name or identifier.
     */
    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    /**
     * Gets the content of the message.
     *
     * @return The content/body of the message.
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the content of the message.
     *
     * @param content The content/body of the message.
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Provides a human-readable representation of the EDIMessage object.
     * Useful for logging, debugging, and displaying the object's state.
     *
     * @return A string representation of the object.
     */
    @Override
    public String toString() {
        return "EDIMessage{" +
                "sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
