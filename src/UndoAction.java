
import java.util.ArrayList;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoableEdit;


/**
 *
 * @author Otto
 */
public class UndoAction implements UndoableEdit {
    
    private ArrayList<Album> albums;
    private Album album;
    
    public UndoAction(ArrayList<Album> albums, Album album) {
        this.albums = albums;
        this.album = album;
    }

    @Override
    public void undo() throws CannotUndoException {
        albums.add(album);
    }

    @Override
    public boolean canUndo() {
        if (this.album != null)
            return true;
        return false;
    }

    @Override
    public void redo() throws CannotRedoException {
        this.albums.remove(this.album);
    }

    @Override
    public boolean canRedo() {
        return true;
    }

    @Override
    public void die() {
        this.albums = null;
        this.album = null;
    }

    @Override
    public boolean addEdit(UndoableEdit anEdit) {
        return false;
    }

    @Override
    public boolean replaceEdit(UndoableEdit anEdit) {
        return false;
    }

    @Override
    public boolean isSignificant() {
        return true;
    }

    @Override
    public String getPresentationName() {
        return "Manipulate albums-list";
    }

    @Override
    public String getUndoPresentationName() {
        return "Bring last deleted album back to list";
    }

    @Override
    public String getRedoPresentationName() {
        return "Delete last redo";
    }
    
}
