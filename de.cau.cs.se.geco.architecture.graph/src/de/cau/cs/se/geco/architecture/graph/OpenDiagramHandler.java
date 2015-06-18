package de.cau.cs.se.geco.architecture.graph;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import de.cau.cs.kieler.klighd.ui.DiagramViewManager;
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties;
import de.cau.cs.se.geco.architecture.ArchitectureStandaloneSetupGenerated;

/**
 * A simple handler for opening diagrams.
 */
public class OpenDiagramHandler extends AbstractHandler {

    /**
     * {@inheritDoc}
     */
    public Object execute(final ExecutionEvent event) throws ExecutionException {
        final ISelection selection = HandlerUtil.getCurrentSelection(event);
        if (selection instanceof IStructuredSelection) {
            final IStructuredSelection sSelection  = (IStructuredSelection) selection;
            Object model = null;
            if (sSelection.getFirstElement() instanceof IFile) {
            	final IFile f = (IFile) sSelection.getFirstElement();
            	
            	final Injector injector = new ArchitectureStandaloneSetupGenerated().createInjectorAndDoEMFRegistration();
				injector.injectMembers(this);
				final XtextResourceSet resourceSet = new XtextResourceSet();
				resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
				
				final URI uri = URI.createPlatformResourceURI(f.getFullPath().toString(), false);
				final Resource resource = resourceSet.getResource(uri, true);
				if (resource.getContents().size() > 0) {
					model = resource.getContents().get(0);
				}
            } else {
                model = sSelection.getFirstElement();
            }
            
            DiagramViewManager.createView(
                    "de.cau.cs.se.geco.architecture.graph.ModelDiagram", "Model Diagram", model, KlighdSynthesisProperties.create());
        } else {
            MessageDialog.openInformation(HandlerUtil.getActiveShell(event), "Unsupported element",
                    "KLighD diagram synthesis is unsupported for the current selection "
                            + selection.toString() + ".");
        }
        return null;
    }
    
 }
