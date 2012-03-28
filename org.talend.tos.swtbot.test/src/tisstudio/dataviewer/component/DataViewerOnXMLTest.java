// ============================================================================
//
// Copyright (C) 2006-2012 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package tisstudio.dataviewer.component;

import junit.framework.Assert;

import org.eclipse.swt.graphics.Point;
import org.eclipse.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.swtbot.TalendSwtBotForTos;
import org.talend.swtbot.Utilities;
import org.talend.swtbot.items.TalendJobItem;
import org.talend.swtbot.items.TalendXmlFileItem;

/**
 * DOC vivian class global comment. Detailled comment
 */
@RunWith(SWTBotJunit4ClassRunner.class)
public class DataViewerOnXMLTest extends TalendSwtBotForTos {

    private TalendJobItem jobItem;

    private TalendXmlFileItem fileItem;

    private static final String JOBNAME = "job1"; //$NON-NLS-1$

    private static final String FILENAME = "xml"; //$NON-NLS-1$

    @Before
    public void createJob() {
        repositories.add(ERepositoryObjectType.PROCESS);
        repositories.add(ERepositoryObjectType.METADATA_FILE_XML);
        jobItem = new TalendJobItem(JOBNAME);
        jobItem.create();
        fileItem = new TalendXmlFileItem(FILENAME);
        fileItem.create();
    }

    @Test
    public void testDataViewer() {
        // drag metadataItem to job
        fileItem.setComponentType("tFileInputXML");
        Utilities.dndMetadataOntoJob(jobItem.getEditor(), fileItem.getItem(), fileItem.getComponentType(), new Point(100, 100));
        SWTBotGefEditPart xml = getTalendComponentPart(jobItem.getEditor(), FILENAME);
        Assert.assertNotNull("cann't get component " + fileItem.getComponentType() + "", xml);

        // data Viewer
        Utilities.dataView(jobItem, xml, fileItem.getComponentType());
        int number = gefBot.tree().rowCount();
        Assert.assertEquals("the result is not the expected result", 12, number);

    }

}