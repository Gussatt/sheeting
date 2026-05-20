import React from 'react';

export const Layout = ({ children }: { children: React.ReactNode }) => {
  return (
    <div className="layout-grid">
      <aside className="layout-sidebar">
        <h2>Sheeting</h2>
        {/* Navigation items will go here */}
      </aside>
      <main className="layout-main">
        {children}
      </main>
    </div>
  );
};
