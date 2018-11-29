import React from 'react';
import ReactDOM from 'react-dom';
import SampleViewer from './SampleViewer';


// Find all DOM containers, and render an viewer instance into them.
document.querySelectorAll('.sample-viewer')
  .forEach(domContainer => {
    // Read the comment ID from a data-* attribute.
      const viewerID = domContainer.dataset.pathwayid;
      console.log(viewerID);
      ReactDOM.render(
      <SampleViewer viewerId = {viewerID}/> ,
      domContainer
    );
  });
